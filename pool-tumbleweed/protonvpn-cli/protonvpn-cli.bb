SUMMARY = "Official Proton VPN CLI"
DESCRIPTION = "The Proton VPN CLI is intended for every Proton VPN service user."
LICENSE = "GPL-3.0-or-later"

PV = "3.13.0"

RPM_NAME = "protonvpn-cli-3.13.0-1.3.noarch.rpm"
RPM_HASH = "56372b05c9f625ce0aaf048645f4537f78c40c2b0d27fd55f06a9131a14fc60d2b9d09771df78e158bfdc5194e5dbefbfa055e093e0221bbd45b90cbf7423a63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "protonvpn-cli \
python3.11dist-protonvpn-cli \
python3dist-protonvpn-cli"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-protonvpn-nm-lib \
python3-pythondialog"

inherit rpm
