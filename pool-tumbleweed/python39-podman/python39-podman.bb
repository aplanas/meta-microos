SUMMARY = "A library to interact with a Podman server"
DESCRIPTION = "A library to interact with a Podman server"
LICENSE = "Apache-2.0"

PV = "4.6.0"

RPM_NAME = "python39-podman-4.6.0-1.1.noarch.rpm"
RPM_HASH = "f5796ae86012881b61e421392096b48a14d5e78e45320468de02636f52e329976eb87275abc3e1de2e998b3ffb8fbe325f500ba0ba7d33cf1f436431847b36dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-podman \
python39-podman \
python3dist-podman"

RDEPENDS:${PN} += "python-abi \
python39-pyxdg \
python39-requests \
python39-urllib3"

inherit rpm
