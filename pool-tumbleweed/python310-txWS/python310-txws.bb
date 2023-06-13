SUMMARY = "Twisted WebSockets wrapper"
DESCRIPTION = "txWS (Twisted WebSockets) is a library for \
adding WebSockets server support to Twisted applications."
LICENSE = "X11"

PV = "0.9.1"

RPM_NAME = "python310-txWS-0.9.1-4.1.noarch.rpm"
RPM_HASH = "2bca976b67d45a9bcc6794bcfdb16e25112d559af14f4f12c94dd09c5ecdbbc248bf7d8b46c9d9f4b876b16ceb52b2307b45e77da465e8a18d86b80f191cea53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-txWS \
python3.10dist(txws) \
python310-txWS \
python3dist(txws)"

RDEPENDS:${PN} += "python(abi) \
python310-Twisted"

inherit rpm
