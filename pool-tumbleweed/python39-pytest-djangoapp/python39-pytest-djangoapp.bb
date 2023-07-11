SUMMARY = "Pytest plugin for Django pluggable application testing"
DESCRIPTION = "A pytest plugin to help with Django pluggable application testing."
LICENSE = "BSD-3-Clause"

PV = "0.15.2"

RPM_NAME = "python39-pytest-djangoapp-0.15.2-2.9.noarch.rpm"
RPM_HASH = "d643569ff451f19b172d7367436d9c0247d0106c1015f37cbf1cd60a38f3dd67312b963e25b4633d15b76a1c40b54e97528699e7f80a51b5d200d4b7c8cefcf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-djangoapp \
python39-pytest-djangoapp \
python3dist-pytest-djangoapp"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-pytest"

inherit rpm
