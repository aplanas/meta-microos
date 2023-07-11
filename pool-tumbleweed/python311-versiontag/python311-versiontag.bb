SUMMARY = "Python git tag based version numbers"
DESCRIPTION = "Simple git tag based version numbers."
LICENSE = "ISC"

PV = "1.2.0"

RPM_NAME = "python311-versiontag-1.2.0-2.9.noarch.rpm"
RPM_HASH = "e4551cb94868aaca7cd17ade2dc9e46ce6f395c2b583cd2854b6e22bf2d10342c91c6525c23e6dfc5200640a81d361cc495ef80ea84a7acfd0da69308399f3e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-versiontag \
python3.11dist-versiontag \
python311-versiontag \
python3dist-versiontag"

RDEPENDS:${PN} += "git-core \
python-abi"

inherit rpm
