SUMMARY = "Create cloud-init compatible image seeds"
DESCRIPTION = "Create cloud-init compatible image seeds"
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python311-cloud-init-seed-0.3.0-2.15.noarch.rpm"
RPM_HASH = "a553f50d65503e2b69c32fc26306d0e1d7a7078032bc5e42ce7cfb213e13ed5c8ea1aaf19cf7624bf473e31c6a4383d7f4397cecc1455d4cd8380f2ea80c11d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cloud-init-seed \
python3.11dist-cloud-init-seed \
python311-cloud-init-seed \
python3dist-cloud-init-seed"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
mkisofs \
python-abi \
update-alternatives"

inherit rpm
