SUMMARY = "A library to interact with a Podman server"
DESCRIPTION = "A library to interact with a Podman server"
LICENSE = "Apache-2.0"

PV = "4.5.1"

RPM_NAME = "python310-podman-4.5.1-2.3.noarch.rpm"
RPM_HASH = "f4e44cd39a59d651aa910ac8ca0f996845cf3985dd03af88d913017d5d7bba620b034d73ed5106f2a411a42847da16f57cdd6f859382cdeb53e75f101093d384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-podman \
python310-podman \
python3dist-podman"

RDEPENDS:${PN} += "python-abi \
python310-pytoml \
python310-pyxdg \
python310-requests \
python310-urllib3"

inherit rpm
