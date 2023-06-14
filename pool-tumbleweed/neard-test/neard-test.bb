SUMMARY = "Files needed for NFC development"
DESCRIPTION = "Files needed to test applications for the NFC stack."
LICENSE = "GPL-2.0-only"

PV = "0.18"

RPM_NAME = "neard-test-0.18-1.3.aarch64.rpm"
RPM_HASH = "aed7e88d020c09b17e6ddb6a16bfce90d43a616291fe8089c3f3dfcb6578d33b406fae1fb8429694a6f7d9a94a9c5e63aff118e88b44681eb233b9e976635c24"

RPROVIDES:${PN} += "neard-test"

RDEPENDS:${PN} += "/usr/bin/python \
/usr/bin/python2.7 \
neard"

inherit rpm
