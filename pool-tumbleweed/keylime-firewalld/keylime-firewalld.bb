SUMMARY = "Firewalld service file for keylime"
DESCRIPTION = "Subpackage of keylime for the firewalld XML service file."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.4.0"

RPM_NAME = "keylime-firewalld-7.4.0-1.1.noarch.rpm"
RPM_HASH = "026d9849c9d2bf1c708ad5f34080b668c80c921b21eaed1467a3b6dbe66f34bb98ceae365d9e812654d472e389ac4a73d921ffd893d15a0060347f3d38925479"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-firewalld"

RDEPENDS:${PN} += "/usr/bin/sh \
python3-keylime"

inherit rpm
