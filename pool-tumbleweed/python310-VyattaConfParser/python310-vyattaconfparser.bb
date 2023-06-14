SUMMARY = "A python config parser for Vyatta/VyOS"
DESCRIPTION = "Vyatta/VyOS config parser with unicode support and without dependencies."
LICENSE = "MIT"

PV = "0.5.5"

RPM_NAME = "python310-VyattaConfParser-0.5.5-1.19.noarch.rpm"
RPM_HASH = "3e1e596ecc811483e7d8014fa8058e8f39b1fd9417f9f843cb2ed26634f58745f26f319255ef4c0b1b376f4ad1225076b88c6f2c655440b012706342226c676a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-VyattaConfParser \
python3.10dist-vyattaconfparser \
python310-VyattaConfParser \
python3dist-vyattaconfparser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
