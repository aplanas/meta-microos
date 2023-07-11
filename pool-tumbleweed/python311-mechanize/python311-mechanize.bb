SUMMARY = "Stateful programmatic web browsing"
DESCRIPTION = "Stateful programmatic web browsing in Python. Browse pages \
programmatically with HTML form filling and clicking \
of links."
LICENSE = "BSD-3-Clause & (BSD-3-Clause | ZPL-2.1)"

PV = "0.4.8"

RPM_NAME = "python311-mechanize-0.4.8-6.1.noarch.rpm"
RPM_HASH = "922e1fe96289a4e92117ee1d42c176b4a9e991451160c4b6239ecbaca53e0393b04d87c115a308f217ee6c1359df8bbccfbcac56f35aef81833c2d6be5c0a76c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mechanize \
python3.11dist-mechanize \
python311-mechanize \
python3dist-mechanize"

RDEPENDS:${PN} += "python-abi \
python311-html5lib"

inherit rpm
