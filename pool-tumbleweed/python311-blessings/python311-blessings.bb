SUMMARY = "A thin, practical wrapper around terminal capabilities in Python"
DESCRIPTION = "Curses-like terminal wrapper with a display based on compositing 2d \
arrays of text."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "python311-blessings-1.7-3.3.noarch.rpm"
RPM_HASH = "49d966dfce588ef99dfa21aeca3923af543ea4a15b7786905e78f335dc121378a7159b16cee955b2d5f3b0bebf301b8a6eef176a10f783e47f8f4ed1f1f3ca74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-blessings \
python3.11dist-blessings \
python311-blessings \
python3dist-blessings"

RDEPENDS:${PN} += "python-abi \
python311-curses \
python311-six"

inherit rpm
