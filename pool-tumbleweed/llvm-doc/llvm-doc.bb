SUMMARY = "Documentation for LLVM"
DESCRIPTION = "This package contains documentation for the LLVM infrastructure. \
 \
This package is a dummy package that depends on the version of \
llvm-doc that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "16.0.6"

RPM_NAME = "llvm-doc-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "58ce75a45f6292d4437fc22bba762ee0e83dd0c599693e0fe30aae84b55745a294d746a80315c77ec0cbfab0052cbda8d83562e69fbdecd4bbc856a45bc41999"

RPROVIDES:${PN} += "llvm-doc"

RDEPENDS:${PN} += "llvm \
llvm16-doc"

inherit rpm
