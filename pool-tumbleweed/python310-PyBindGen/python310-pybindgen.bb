SUMMARY = "Python Bindings Generator"
DESCRIPTION = "A tool to generate Python bindings for C/C++ code."
LICENSE = "LGPL-2.1-only"

PV = "0.22.1"

RPM_NAME = "python310-PyBindGen-0.22.1-1.4.noarch.rpm"
RPM_HASH = "26b7012669716b61559e1b8cc97d9e2c2c25a561c0ece7a4682166a0c954686e9e9cae37254e6ce9fa000f042ad4a741a82a73099c4028abe7d83ddd5fcaa69e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pybindgen \
python310-PyBindGen \
python3dist-pybindgen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
