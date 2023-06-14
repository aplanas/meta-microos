SUMMARY = "Tools for visualising the LLVM optimization records"
DESCRIPTION = "Set of tools for visualising the LLVM optimization records generated with -fsave-optimization-record. Used for compiler-assisted performance analysis."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "llvm15-opt-viewer-15.0.7-2.4.noarch.rpm"
RPM_HASH = "ce1db10249fb8557c74437fb16025e66f9c07297b052cb3e778a55501aab284c7f2d44f75f87ef270f58f35d3f3a61ac0b5c517c5e9aab283a7462178d6c7ec6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm15-opt-viewer \
opt-viewer"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PyYAML \
python3-Pygments"

inherit rpm
