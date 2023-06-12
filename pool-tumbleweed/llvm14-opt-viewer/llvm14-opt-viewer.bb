SUMMARY = "Tools for visualising the LLVM optimization records"
DESCRIPTION = "Set of tools for visualising the LLVM optimization records generated with -fsave-optimization-record. Used for compiler-assisted performance analysis."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-opt-viewer-14.0.6-9.1.noarch.rpm"
RPM_HASH = "be816335e1e5ed0399b3b5e9b11df282bad2961d412e0b9570683ecc4275e44b007d2eda051c5c101266af70c10555f02094a3a4890ac8f78434f13cbc40b072"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm14-opt-viewer \
opt-viewer"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-PyYAML \
python3-Pygments"

inherit rpm
