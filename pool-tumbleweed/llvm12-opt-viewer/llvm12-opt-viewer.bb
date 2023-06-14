SUMMARY = "Tools for visualising the LLVM optimization records"
DESCRIPTION = "Set of tools for visualising the LLVM optimization records generated with -fsave-optimization-record. Used for compiler-assisted performance analysis."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "llvm12-opt-viewer-12.0.1-12.1.noarch.rpm"
RPM_HASH = "a2006519b999b4fe06ba30155e92d9918682e725058693c9fb5e9667214050e94d98a7be39453e3dc2ba4b7aff1a7e293788811269bb358a19a5620c62d8ee6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm12-opt-viewer \
opt-viewer"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PyYAML \
python3-Pygments"

inherit rpm
