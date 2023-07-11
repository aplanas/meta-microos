SUMMARY = "A python config parser for Vyatta/VyOS"
DESCRIPTION = "Vyatta/VyOS config parser with unicode support and without dependencies."
LICENSE = "MIT"

PV = "0.5.5"

RPM_NAME = "python310-VyattaConfParser-0.5.5-1.21.noarch.rpm"
RPM_HASH = "dbcd78cecf53df840b1f6eb282215b89167166c7e71709a4efc34d298ce4650426a3ba171f5228180fd4493e26f33a269ef9a9aaa9ca55c07aed081994baf652"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-vyattaconfparser \
python310-VyattaConfParser \
python3dist-vyattaconfparser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
