SUMMARY = "Twisted WebSockets wrapper"
DESCRIPTION = "txWS (Twisted WebSockets) is a library for \
adding WebSockets server support to Twisted applications."
LICENSE = "X11"

PV = "0.9.1"

RPM_NAME = "python310-txWS-0.9.1-4.2.noarch.rpm"
RPM_HASH = "a1c6d40836955cb017b69467723c7028280c46877aa7240ce5e4fb8522c2d2cd1d47ff31f297353479def8e080520046ee85f80939798307f45a8c2a3f60fb17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-txws \
python310-txWS \
python3dist-txws"

RDEPENDS:${PN} += "python-abi \
python310-Twisted"

inherit rpm
