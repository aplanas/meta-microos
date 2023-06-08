SUMMARY = "Package providing R-core packages R-compiler"
DESCRIPTION = "This package provides R-compiler, one of the R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-compiler-4.3.0-45.1.aarch64.rpm"
RPM_HASH = "41cd6f905eb851c0f68d8e9bf99dbe95065681c6df146d0e78b91311f495059fd609f5d9856742972b8e2a2bfadfc787c6f80d8e5d698c182822c0c9ab74e221"

RPROVIDES:${PN} += "R-compiler R-compiler(aarch-64)"
RDEPENDS:${PN} += "R-base"

inherit rpm
