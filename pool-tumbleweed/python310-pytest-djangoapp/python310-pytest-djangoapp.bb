SUMMARY = "Pytest plugin for Django pluggable application testing"
DESCRIPTION = "A pytest plugin to help with Django pluggable application testing."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "python310-pytest-djangoapp-1.2.0-1.1.noarch.rpm"
RPM_HASH = "91476eb11c46f3e83f49f929a3307bc79466521cd64a61862ef7c3b95f5ce436975e5c506f658bd9ffb9bbef07a532dc830abaacde6f9643e4d9df51a652828f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-djangoapp \
python310-pytest-djangoapp \
python3dist-pytest-djangoapp"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-pytest"

inherit rpm
