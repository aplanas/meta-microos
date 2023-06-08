SUMMARY = "Development files for clingo"
DESCRIPTION = "The clingo-devel package contains libraries and header files for \
developing applications that use clingo."
LICENSE = "MIT"

PV = "5.6.2"

RPM_NAME = "clingo-devel-5.6.2-1.3.aarch64.rpm"
RPM_HASH = "7bd58dd70a864fc41f98dbd999eb9c9153ab4aa7e855c3742698abcae64109fc6634e1f784f1ff313e75481918784e186c0e04daeada0ab4d844a10abc41304b"

RPROVIDES:${PN} += "clingo-devel clingo-devel(aarch-64) cmake(Clingo)"
RDEPENDS:${PN} += "clingo libclingo4"

inherit rpm
