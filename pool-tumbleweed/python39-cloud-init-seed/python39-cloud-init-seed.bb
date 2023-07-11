SUMMARY = "Create cloud-init compatible image seeds"
DESCRIPTION = "Create cloud-init compatible image seeds"
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python39-cloud-init-seed-0.3.0-2.15.noarch.rpm"
RPM_HASH = "cc63d85b9b935651564acd9a52e0421955f7ab9770bc2189e1d990bcf269cb5fa5f21e278668bf715c8c67937ce194becc7f2bc9b80611682a8f6620d7830805"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cloud-init-seed \
python39-cloud-init-seed \
python3dist-cloud-init-seed"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
mkisofs \
python-abi \
update-alternatives"

inherit rpm
