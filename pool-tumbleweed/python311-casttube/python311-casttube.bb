SUMMARY = "YouTube chromecast api"
DESCRIPTION = "casttube provides a way to interact with the Youtube Chromecast api."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python311-casttube-0.2.1-2.4.noarch.rpm"
RPM_HASH = "4811dfdb3e7c059b6297df30afa45758b7c6c13373e199bb73e41f23d95030d1413d8a170bd9618193941d2c39b3c0591f179a62dd78e5703ac36fb2d2269751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-casttube \
python3.11dist-casttube \
python311-casttube \
python3dist-casttube"

RDEPENDS:${PN} += "python-abi"

inherit rpm
