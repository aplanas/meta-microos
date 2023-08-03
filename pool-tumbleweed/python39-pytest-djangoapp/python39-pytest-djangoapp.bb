SUMMARY = "Pytest plugin for Django pluggable application testing"
DESCRIPTION = "A pytest plugin to help with Django pluggable application testing."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "python39-pytest-djangoapp-1.2.0-1.1.noarch.rpm"
RPM_HASH = "a8a0808f738c8038759f3d663383057315ddf416225ef269a93b9d45a612f6e24e7cde4f08d4ebe8de3d2eb1707b4411576aebb4ffd1049431f10b6c442678c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-djangoapp \
python39-pytest-djangoapp \
python3dist-pytest-djangoapp"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-pytest"

inherit rpm
