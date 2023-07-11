SUMMARY = "Twisted WebSockets wrapper"
DESCRIPTION = "txWS (Twisted WebSockets) is a library for \
adding WebSockets server support to Twisted applications."
LICENSE = "X11"

PV = "0.9.1"

RPM_NAME = "python311-txWS-0.9.1-4.2.noarch.rpm"
RPM_HASH = "d63abd2f55d03b2d0ea33d714e69e59e037298b675f71999976de5f656a8bdb305a7f8cd41f9dd4d8803bbcb1307bd14011e7fd161ef4f95c5b4db83fa6c7182"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-txWS \
python3.11dist-txws \
python311-txWS \
python3dist-txws"

RDEPENDS:${PN} += "python-abi \
python311-Twisted"

inherit rpm
