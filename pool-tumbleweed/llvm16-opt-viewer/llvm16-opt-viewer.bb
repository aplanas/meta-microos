SUMMARY = "Tools for visualising the LLVM optimization records"
DESCRIPTION = "Set of tools for visualising the LLVM optimization records generated with -fsave-optimization-record. Used for compiler-assisted performance analysis."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "llvm16-opt-viewer-16.0.4-1.1.noarch.rpm"
RPM_HASH = "e5231188af477d6f812f4403493ae46352f077eec0c9ed7df58f979d440ba42df87fc5bcccbe3fb2fbd39cc8e7a22f1ff1381c1f401fac26e9743d10fdde0698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm16-opt-viewer \
opt-viewer"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PyYAML \
python3-Pygments"

inherit rpm
