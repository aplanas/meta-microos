SUMMARY = "Fixtures in freeze_time"
DESCRIPTION = "Wrap tests with fixtures in freeze_time"
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "python311-pytest-freezegun-0.4.2-3.1.noarch.rpm"
RPM_HASH = "1eabb7ec0c41834b8750bc95c126ebecfbd65d20142839a2e9a75b746c73efb17e4839800aeea65ab1a82ecd87d4faedf8638aeafaa3472a5cfe687d227c7c41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-freezegun) \
python311-pytest-freezegun \
python3dist(pytest-freezegun)"

RDEPENDS:${PN} += "python(abi) \
python311-freezegun \
python311-pytest"

inherit rpm
