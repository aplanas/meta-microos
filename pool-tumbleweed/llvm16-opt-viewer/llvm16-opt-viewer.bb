SUMMARY = "Tools for visualising the LLVM optimization records"
DESCRIPTION = "Set of tools for visualising the LLVM optimization records generated with -fsave-optimization-record. Used for compiler-assisted performance analysis."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.6"

RPM_NAME = "llvm16-opt-viewer-16.0.6-1.1.noarch.rpm"
RPM_HASH = "07a5e6c4cd8b7218dd2f37ae7dda859947be81cfb1cda51379ae59c0600a9ab9504f1900a8f903c0ab4cd39d55248d595dac3303ce72621d9695ffc57f1edc60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm16-opt-viewer \
opt-viewer"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PyYAML \
python3-Pygments"

inherit rpm
