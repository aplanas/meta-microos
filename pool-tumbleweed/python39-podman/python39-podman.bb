SUMMARY = "A library to interact with a Podman server"
DESCRIPTION = "A library to interact with a Podman server"
LICENSE = "Apache-2.0"

PV = "4.5.1"

RPM_NAME = "python39-podman-4.5.1-1.1.noarch.rpm"
RPM_HASH = "fb7361007de893466417fc98dc052044d9a9ef7cb677f5cd88897f8e12041d83894dd6686004dafc6f7971d5cfad00b4168d080fe40dae743c65d2668452f945"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(podman) \
python39-podman \
python3dist(podman)"

RDEPENDS:${PN} += "python(abi) \
python39-pyxdg \
python39-requests \
python39-urllib3"

inherit rpm
