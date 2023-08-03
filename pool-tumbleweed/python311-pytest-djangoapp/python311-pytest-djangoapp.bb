SUMMARY = "Pytest plugin for Django pluggable application testing"
DESCRIPTION = "A pytest plugin to help with Django pluggable application testing."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "python311-pytest-djangoapp-1.2.0-1.1.noarch.rpm"
RPM_HASH = "6ebf1a944760a97e4a857d7ebc2fa26798c74a6b84d57dbd20c4fdc7910d0e8fa2420cf59693888aa6be5ba567fc9b505cd6201c9ca27c7e5b3143b9d540340c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-djangoapp \
python3.11dist-pytest-djangoapp \
python311-pytest-djangoapp \
python3dist-pytest-djangoapp"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-pytest"

inherit rpm
