SUMMARY = "A python config parser for Vyatta/VyOS"
DESCRIPTION = "Vyatta/VyOS config parser with unicode support and without dependencies."
LICENSE = "MIT"

PV = "0.5.5"

RPM_NAME = "python311-VyattaConfParser-0.5.5-1.21.noarch.rpm"
RPM_HASH = "01fcaf45d7d90688920690b4b5173997b67f2c505b5583d35eb99eac2902b879af72d493a5ec3ce707aac1da77c2db53714e637ea2b2f7a52876a5b03ce86d70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-VyattaConfParser \
python3.11dist-vyattaconfparser \
python311-VyattaConfParser \
python3dist-vyattaconfparser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
