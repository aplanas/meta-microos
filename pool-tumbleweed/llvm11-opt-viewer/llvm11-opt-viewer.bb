SUMMARY = "Tools for visualising the LLVM optimization records"
DESCRIPTION = "Set of tools for visualising the LLVM optimization records generated with -fsave-optimization-record. Used for compiler-assisted performance analysis."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "llvm11-opt-viewer-11.0.1-13.1.noarch.rpm"
RPM_HASH = "f9786d2f6a026bcb48934170991f8f6993f425b8d95ecc50ee6efa1b2a4a3581541bbe94e03b1fd037c6ba9d074b008f7894ae624b8bc8386bf00ba569bc3b63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm11-opt-viewer \
opt-viewer"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PyYAML \
python3-Pygments"

inherit rpm
