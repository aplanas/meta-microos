SUMMARY = "Python library for working with date and datetime objects"
DESCRIPTION = "Python library for working with date and datetime objects."
LICENSE = "0BSD"

PV = "0.6.12"

RPM_NAME = "python311-dateutils-0.6.12-2.1.noarch.rpm"
RPM_HASH = "da89bd82dc3e4dc912b334b73d868874b10553d369a8f5999f09714da84b2469b221075f260eb1addb47567decaa12ac6612c9b277c34ae46def84e7bbc5f6f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dateutils \
python3.11dist-dateutils \
python311-dateutils \
python3dist-dateutils"

RDEPENDS:${PN} += "python-abi \
python311-python-dateutil \
python311-pytz"

inherit rpm
