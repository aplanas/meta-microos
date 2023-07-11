SUMMARY = "Python bindings for libmsym"
DESCRIPTION = "This package contains the python bindings needed to develop \
python applications that require libmsym."
LICENSE = "MIT"

PV = "0.2.3"

RPM_NAME = "python39-libmsym-0.2.3-2.6.noarch.rpm"
RPM_HASH = "f447dc69147e95eee11eba8dadbf17f69b55f09e881b701598b2c47a85bba9b75a82c9354fadf4018ffd176bbba97426e5a8e8a48a73a0333e86176284a29896"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-libmsym \
python39-libmsym \
python3dist-libmsym"

RDEPENDS:${PN} += "python-abi"

inherit rpm
