SUMMARY = "A library to interact with a Podman server"
DESCRIPTION = "A library to interact with a Podman server"
LICENSE = "Apache-2.0"

PV = "4.5.1"

RPM_NAME = "python39-podman-4.5.1-2.3.noarch.rpm"
RPM_HASH = "f1a1f8eed937839cf2f3a5553088566093d0952166a280da9088c2366462ca415a6d62a515923ae5aba9609f3bf213451a3ce4dbc3b1699dca4bf42717746238"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-podman \
python39-podman \
python3dist-podman"

RDEPENDS:${PN} += "python-abi \
python39-pytoml \
python39-pyxdg \
python39-requests \
python39-urllib3"

inherit rpm
