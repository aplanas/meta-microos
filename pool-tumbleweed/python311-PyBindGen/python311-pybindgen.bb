SUMMARY = "Python Bindings Generator"
DESCRIPTION = "A tool to generate Python bindings for C/C++ code."
LICENSE = "LGPL-2.1-only"

PV = "0.22.1"

RPM_NAME = "python311-PyBindGen-0.22.1-1.4.noarch.rpm"
RPM_HASH = "70d513ffe645ffdabe25d13c7f848db33514d42fd6ffe3ac11160cbb772ad4787494d0c42b3959ef133e45d1cec47d425497f7e76f8b64638674eb79efa519e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyBindGen \
python3.11dist-pybindgen \
python311-PyBindGen \
python3dist-pybindgen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
