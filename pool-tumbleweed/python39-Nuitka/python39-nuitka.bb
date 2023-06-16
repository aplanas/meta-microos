SUMMARY = "Python compiler with full language support and CPython compatibility"
DESCRIPTION = "Python compiler with full language support and CPython compatibility. \
 \
This Python compiler achieves full language compatibility and compiles Python \
code into compiled objects that are not second class at all. Instead they can be \
used in the same way as pure Python objects."
LICENSE = "Apache-2.0"

PV = "1.4.5"

RPM_NAME = "python39-Nuitka-1.4.5-2.1.noarch.rpm"
RPM_HASH = "8b435a239d3f394aad4c3b7e14b39b6ce0e07434e69506667112dfe515a54432371dc427dfe61c0b63ca739d716ad6feefcf75bb7b4937764f9c8a9861ec5c92"
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
