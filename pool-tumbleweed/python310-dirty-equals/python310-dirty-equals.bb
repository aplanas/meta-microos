SUMMARY = "Doing dirty (but useful) things with equals"
DESCRIPTION = "Doing dirty (but extremely useful) things with equals."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python310-dirty-equals-0.5.0-1.5.noarch.rpm"
RPM_HASH = "b8f867821e241051434eeccb352139353000883e7179e520de266715e26a990c6b3b2342d546d6d6284cbeca5324392de6d7c80876effd2d6891c7d75f71e8cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dirty-equals \
python310-dirty-equals \
python3dist-dirty-equals"

RDEPENDS:${PN} += "python-abi \
python310-pytz"

inherit rpm
