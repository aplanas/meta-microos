SUMMARY = "Official Proton VPN CLI"
DESCRIPTION = "The Proton VPN CLI is intended for every Proton VPN service user."
LICENSE = "GPL-3.0-or-later"

PV = "3.13.0"

RPM_NAME = "protonvpn-cli-3.13.0-1.2.noarch.rpm"
RPM_HASH = "69c338b19c1865afa4274b7e35c6107e90e3b16a19f144e26b5c747ff79a804a9cd93f9f8de4994668289070a1b7bdb2b6324b4845be2aa73edfdc324398e4d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "protonvpn-cli \
python3.10dist(protonvpn-cli) \
python3dist(protonvpn-cli)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-protonvpn-nm-lib \
python3-pythondialog"

inherit rpm
