SUMMARY = "A library to interact with a Podman server"
DESCRIPTION = "A library to interact with a Podman server"
LICENSE = "Apache-2.0"

PV = "4.6.0"

RPM_NAME = "python310-podman-4.6.0-1.1.noarch.rpm"
RPM_HASH = "fb08b9ec4c6a7882c1f79787ed5107cfa205b9b6c6d869cedadf816ed2810960c4eb72aa1e419736d89da9345dc96956b6f2dbd4a230f025572e4fcccdfa3160"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-podman \
python310-podman \
python3dist-podman"

RDEPENDS:${PN} += "python-abi \
python310-pyxdg \
python310-requests \
python310-urllib3"

inherit rpm
