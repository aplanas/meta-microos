SUMMARY = "Fixtures in freeze_time"
DESCRIPTION = "Wrap tests with fixtures in freeze_time"
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "python310-pytest-freezegun-0.4.2-3.3.noarch.rpm"
RPM_HASH = "a4f4d2f61b6f3c568428515e72b31142702024d2dfc1147cfb7e5109bf56a8b3d67904d90c441beee812d9309e1284e33b062af65849ee17ca784c345072c176"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-freezegun \
python310-pytest-freezegun \
python3dist-pytest-freezegun"

RDEPENDS:${PN} += "python-abi \
python310-freezegun \
python310-pytest"

inherit rpm
