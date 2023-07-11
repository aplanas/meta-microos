SUMMARY = "Tools for visualising the LLVM optimization records"
DESCRIPTION = "Set of tools for visualising the LLVM optimization records generated with -fsave-optimization-record. Used for compiler-assisted performance analysis."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "llvm15-opt-viewer-15.0.7-3.1.noarch.rpm"
RPM_HASH = "07b8a8b842735fd2f7665cfd387b835b2a13884a77df47ec85dc8279ecd86733f087f6ed8ace58f154a82304406a538572efb0c7e4cf850562dbaa0e9b26b5d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm15-opt-viewer \
opt-viewer"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PyYAML \
python3-Pygments"

inherit rpm
