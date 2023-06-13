SUMMARY = "Documentation for LLVM"
DESCRIPTION = "This package contains documentation for the LLVM infrastructure."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-doc-13.0.1-9.1.noarch.rpm"
RPM_HASH = "79ec7d1c7156753c535c581e8a02238b8395c0e19968faca2c7ae9107c8e107259d9a92cd81257f0b1c98a027155cab7b745730d368f6a5baf8a0693eb2d6b47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-doc-provider \
llvm13-doc"

RDEPENDS:${PN} += "llvm13"

inherit rpm
