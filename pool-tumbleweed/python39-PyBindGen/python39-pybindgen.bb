SUMMARY = "Python Bindings Generator"
DESCRIPTION = "A tool to generate Python bindings for C/C++ code."
LICENSE = "LGPL-2.1-only"

PV = "0.22.1"

RPM_NAME = "python39-PyBindGen-0.22.1-1.4.noarch.rpm"
RPM_HASH = "2b8f9f7a3791785b2aceea7716c4aaa4c467063a1d65c6a28dc312ddadea86c8f4ed6c1856f1c963585cc53b6ccc7393d9b437e4afa8d22bc759a11a2c8466b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pybindgen \
python39-PyBindGen \
python3dist-pybindgen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
