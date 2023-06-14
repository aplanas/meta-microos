SUMMARY = "Create cloud-init compatible image seeds"
DESCRIPTION = "Create cloud-init compatible image seeds"
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python39-cloud-init-seed-0.3.0-2.13.noarch.rpm"
RPM_HASH = "5bb2a59759209a50ff3bf1d86a03b5817912f942fb2cee1b74b55cad9ecb0707425fdb2b0de27d0bb7e4b9035f638edb35f331d1172b9961fb022b490b4b808a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cloud-init-seed \
python39-cloud-init-seed \
python3dist-cloud-init-seed"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
mkisofs \
python-abi \
update-alternatives"

inherit rpm
