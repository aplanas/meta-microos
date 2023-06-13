SUMMARY = "Create cloud-init compatible image seeds"
DESCRIPTION = "Create cloud-init compatible image seeds"
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python310-cloud-init-seed-0.3.0-2.13.noarch.rpm"
RPM_HASH = "d705106160dfa6719fc9e6eca123d5d1da81cef9a2dc79ae8c0d0e70f5d3f823bc88cfbf24f6536d6789a113f1442ce64b65c79835c28960b60d97db6a7a07cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cloud-init-seed \
python3.10dist(cloud-init-seed) \
python310-cloud-init-seed \
python3dist(cloud-init-seed)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
mkisofs \
python(abi) \
update-alternatives"

inherit rpm
