SUMMARY = "A library to interact with a Podman server"
DESCRIPTION = "A library to interact with a Podman server"
LICENSE = "Apache-2.0"

PV = "4.6.0"

RPM_NAME = "python311-podman-4.6.0-1.1.noarch.rpm"
RPM_HASH = "9bc62184750a271c9a6f549c2c80aff8afab218db928663f03ae5166b3fbcf51accfa0e2057fea421747be609b8a6909f97c40f465e48038c41b7b3c2b690d99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-podman \
python3.11dist-podman \
python311-podman \
python3dist-podman"

RDEPENDS:${PN} += "python-abi \
python311-pyxdg \
python311-requests \
python311-urllib3"

inherit rpm
