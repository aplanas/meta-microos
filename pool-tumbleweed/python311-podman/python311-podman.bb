SUMMARY = "A library to interact with a Podman server"
DESCRIPTION = "A library to interact with a Podman server"
LICENSE = "Apache-2.0"

PV = "4.5.1"

RPM_NAME = "python311-podman-4.5.1-1.1.noarch.rpm"
RPM_HASH = "cf1df1c4096fe870813eddacd5504baf44f5df64439ab9f17c05c1890e38d04dae3ee96b341f11db013a866964c7f99c116cafdae210b2c5e602f073b6974108"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(podman) \
python311-podman \
python3dist(podman)"
RDEPENDS:${PN} += "python(abi) \
python311-pyxdg \
python311-requests \
python311-urllib3"

inherit rpm
