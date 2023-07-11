SUMMARY = "Create cloud-init compatible image seeds"
DESCRIPTION = "Create cloud-init compatible image seeds"
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python310-cloud-init-seed-0.3.0-2.15.noarch.rpm"
RPM_HASH = "f4f74706bdfab22e44eed39d1e5e5b96ab53b2b3c119a2349a5f2d922ae6c816188bf61eee5d79e02f4bbfe0108e810e0aadcb431ce0f133bae2070d4de8df59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cloud-init-seed \
python310-cloud-init-seed \
python3dist-cloud-init-seed"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
mkisofs \
python-abi \
update-alternatives"

inherit rpm
