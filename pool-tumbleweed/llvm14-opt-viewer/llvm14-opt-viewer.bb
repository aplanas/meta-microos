SUMMARY = "Tools for visualising the LLVM optimization records"
DESCRIPTION = "Set of tools for visualising the LLVM optimization records generated with -fsave-optimization-record. Used for compiler-assisted performance analysis."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-opt-viewer-14.0.6-10.1.noarch.rpm"
RPM_HASH = "279d22a86b0ab28760247b36644c8d6044dfe44f4a9a14bd212f3d9ba195fbc36e45667ac08da1f5ea952650b0eeea9acc23de2ddedae20ced533f99060cc94c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm14-opt-viewer \
opt-viewer"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PyYAML \
python3-Pygments"

inherit rpm
