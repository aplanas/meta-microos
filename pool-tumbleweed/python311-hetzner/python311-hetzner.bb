SUMMARY = "High level access to the Hetzner robot"
DESCRIPTION = "A high-level Python API for accessing the Hetzner robot."
LICENSE = "BSD-2-Clause"

PV = "0.8.3"

RPM_NAME = "python311-hetzner-0.8.3-1.10.noarch.rpm"
RPM_HASH = "c94ef5e049514e0434788fe36ecfbc96acfca22932c942f402044b042bcdc514a273bc98d6c90ea09fdb4be80262f17fb7be40d2c15736c0530631df75cee658"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hetzner \
python3.11dist-hetzner \
python311-hetzner \
python3dist-hetzner"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
