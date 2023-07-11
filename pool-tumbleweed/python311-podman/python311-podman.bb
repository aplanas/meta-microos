SUMMARY = "A library to interact with a Podman server"
DESCRIPTION = "A library to interact with a Podman server"
LICENSE = "Apache-2.0"

PV = "4.5.1"

RPM_NAME = "python311-podman-4.5.1-2.3.noarch.rpm"
RPM_HASH = "998ec85e3bf163b58aa3284a29865950580de6815d6f061f0feb8c1ff8ec4f22d0025194446553a463c1e72f654005c8dcc501a0671313ae8ec24aa7afc333df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-podman \
python3.11dist-podman \
python311-podman \
python3dist-podman"

RDEPENDS:${PN} += "python-abi \
python311-pytoml \
python311-pyxdg \
python311-requests \
python311-urllib3"

inherit rpm
