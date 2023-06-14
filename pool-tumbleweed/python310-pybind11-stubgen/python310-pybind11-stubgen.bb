SUMMARY = "PEP 561 type stubs generator for pybind11 modules"
DESCRIPTION = "Generate stubs for python modules.  There are several tweaks to target \
specifically modules compiled using pybind11"
LICENSE = "BSD-3-Clause"

PV = "0.12.0"

RPM_NAME = "python310-pybind11-stubgen-0.12.0-1.4.noarch.rpm"
RPM_HASH = "4fd98ea709a93d42d5aeea0b33fab099d2e6f33e55b0ee2df921e66b4ab934bade9d001e5a0ab82b9a6b69eda1131d237704f74e9a3ef5d2745d26c8353aeec7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pybind11-stubgen \
python3.10dist-pybind11-stubgen \
python310-pybind11-stubgen \
python3dist-pybind11-stubgen"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
update-alternatives"

inherit rpm
