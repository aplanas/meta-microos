SUMMARY = "Tools for visualising the LLVM optimization records"
DESCRIPTION = "Set of tools for visualising the LLVM optimization records generated with -fsave-optimization-record. Used for compiler-assisted performance analysis."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-opt-viewer-13.0.1-10.1.noarch.rpm"
RPM_HASH = "488be228024e2df702a23b8695b041f301fd02ef7c6430938c5003cc5107c7b028e591e08f218eac9bec2c49418ab46deddfa88539c3d20dd7d9fda0205da7ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm13-opt-viewer \
opt-viewer"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PyYAML \
python3-Pygments"

inherit rpm
