SUMMARY = "A python config parser for Vyatta/VyOS"
DESCRIPTION = "Vyatta/VyOS config parser with unicode support and without dependencies."
LICENSE = "MIT"

PV = "0.5.5"

RPM_NAME = "python39-VyattaConfParser-0.5.5-1.21.noarch.rpm"
RPM_HASH = "da8c91784d46d4a826f7306e13ba36b7a023177154b5bfaa90f939dd7f38722a26566706ce1459f910dfc456eaea6409dc2763dfe88aaba9adab1b8dddd7c32e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-vyattaconfparser \
python39-VyattaConfParser \
python3dist-vyattaconfparser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
