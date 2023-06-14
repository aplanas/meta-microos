SUMMARY = "Python diff wrapper"
DESCRIPTION = "Python diff wrapper."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-moreorless-0.4.0-1.3.noarch.rpm"
RPM_HASH = "f67e4db7a4bf977292b8ec6caad2f7ae69a020d8868de0fbbeb5b81d60d0145a632d76f08a4c0af9280a1c6d6df92f0c1da392f7a41a304212939d452624fce4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-moreorless \
python311-moreorless \
python3dist-moreorless"

RDEPENDS:${PN} += "python-abi \
python311-click \
python311-volatile"

inherit rpm
