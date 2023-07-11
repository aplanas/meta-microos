SUMMARY = "Python compiler with full language support and CPython compatibility"
DESCRIPTION = "Python compiler with full language support and CPython compatibility. \
 \
This Python compiler achieves full language compatibility and compiles Python \
code into compiled objects that are not second class at all. Instead they can be \
used in the same way as pure Python objects."
LICENSE = "Apache-2.0"

PV = "1.4.5"

RPM_NAME = "python39-Nuitka-1.4.5-2.2.noarch.rpm"
RPM_HASH = "9007c35ad0247a9e1e8d5d325f89b25c56aaeceda02e670020d14b9a5869dd8a223653cd788fc23d5c16ecdad59e6476691af70e8719cad9c3ad44f36ac1c414"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nuitka \
python39-Nuitka \
python3dist-nuitka"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
gcc-c++ \
python-abi \
python39-Jinja2 \
python39-PyYAML \
python39-appdirs \
python39-atomicwrites \
python39-devel \
scons \
update-alternatives"

inherit rpm
