SUMMARY = "Pytest plugin for Django pluggable application testing"
DESCRIPTION = "A pytest plugin to help with Django pluggable application testing."
LICENSE = "BSD-3-Clause"

PV = "0.15.2"

RPM_NAME = "python311-pytest-djangoapp-0.15.2-2.9.noarch.rpm"
RPM_HASH = "a020f4bc617054b080e8462d87c96643f2001f75db76a6815fd67024f0cd96e5b9fde4a67578efcd43a9cc9a32f6932d2a431627c24d0b1627d03f56d1097aeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-djangoapp \
python3.11dist-pytest-djangoapp \
python311-pytest-djangoapp \
python3dist-pytest-djangoapp"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-pytest"

inherit rpm
