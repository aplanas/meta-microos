SUMMARY = "Doing dirty (but useful) things with equals"
DESCRIPTION = "Doing dirty (but extremely useful) things with equals."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python311-dirty-equals-0.5.0-1.5.noarch.rpm"
RPM_HASH = "c07eaa0ad4723569b55c0f6217795959c92921a845dc63a1b76b39ec3113f0689198f3bf92bdfaf163c8738ab18d6cbbb082283c1e8cc446b445857a3d7ac334"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dirty-equals \
python3.11dist-dirty-equals \
python311-dirty-equals \
python3dist-dirty-equals"

RDEPENDS:${PN} += "python-abi \
python311-pytz"

inherit rpm
