SUMMARY = "Python bindings for VIPS image processing library"
DESCRIPTION = "This package contains the Python bindings for the VIPS library."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python311-pyvips-2.2.1-1.5.noarch.rpm"
RPM_HASH = "2d51864d5f1c7fbb7a53c63ccd9724d165cdfc63673d0f9c04e34e5900bc60c8a097cfd8c775d7c4b2bf4de2f5f940626cd0ae2388c5e5115ca4de8822388dc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyvips \
python3.11dist-pyvips \
python311-pyvips \
python3dist-pyvips"

RDEPENDS:${PN} += "python-abi \
python311-cffi"

inherit rpm
