SUMMARY = "Python compiler with full language support and CPython compatibility"
DESCRIPTION = "Python compiler with full language support and CPython compatibility. \
 \
This Python compiler achieves full language compatibility and compiles Python \
code into compiled objects that are not second class at all. Instead they can be \
used in the same way as pure Python objects."
LICENSE = "Apache-2.0"

PV = "1.4.5"

RPM_NAME = "python310-Nuitka-1.4.5-2.2.noarch.rpm"
RPM_HASH = "069e6a839abfa430e79782012f133dd254563a8980b5c11a40d7a70affd61545a40a04068d44f3c2dd721f245c36844aa6c49dd7f2b52b29ed0c25e4f77f0066"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nuitka \
python310-Nuitka \
python3dist-nuitka"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
gcc-c++ \
python-abi \
python310-Jinja2 \
python310-PyYAML \
python310-appdirs \
python310-atomicwrites \
python310-devel \
scons \
update-alternatives"

inherit rpm
