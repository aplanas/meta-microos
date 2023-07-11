SUMMARY = "Python bindings for libmsym"
DESCRIPTION = "This package contains the python bindings needed to develop \
python applications that require libmsym."
LICENSE = "MIT"

PV = "0.2.3"

RPM_NAME = "python311-libmsym-0.2.3-2.6.noarch.rpm"
RPM_HASH = "382863b320ec15d062e149fc1fef6755c026b360378b124af39b22f6d27fea6563f57cc6adc653b308bd7d27fb90b25e7367171ea647dc62b9967b735b9df7ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libmsym \
python3.11dist-libmsym \
python311-libmsym \
python3dist-libmsym"

RDEPENDS:${PN} += "python-abi"

inherit rpm
