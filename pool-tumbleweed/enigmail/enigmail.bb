SUMMARY = "OpenPGP addon for Mozilla Thunderbird"
DESCRIPTION = "This package contains the Enigmail OpenPGP Addon for Mozilla Thunderbird 78. \
The addon will assist the migration from Enigmail to Thunderbird's built-in \
OpenPGP support."
LICENSE = "MPL-2.0"

PV = "2.2.4"

RPM_NAME = "enigmail-2.2.4-2.1.aarch64.rpm"
RPM_HASH = "83600160b8f0dbd0f927af51a34f7b6ac83e24458feafa63e5943267b23bd7b2c4fb47f21783f410030ce3c95c607be35c78c04ff40bd5e86faa6167292f1c05"

RPROVIDES:${PN} += "enigmail"

RDEPENDS:${PN} += "MozillaThunderbird \
gpg2 \
pinentry-gui"

inherit rpm
