SUMMARY = "Create cloud-init compatible image seeds"
DESCRIPTION = "Create cloud-init compatible image seeds"
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python311-cloud-init-seed-0.3.0-2.13.noarch.rpm"
RPM_HASH = "54cd254bca187bee35d4f52af5913cfe6ea606595e7f1ec938ea2ba798ae64c634fc506de0fef69fc9f099d08ea71be554eda10df40eaa06c8a9be8526b13dfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-cloud-init-seed \
python311-cloud-init-seed \
python3dist-cloud-init-seed"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
mkisofs \
python-abi \
update-alternatives"

inherit rpm
