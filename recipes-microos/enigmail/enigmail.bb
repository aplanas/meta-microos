SUMMARY = "OpenPGP addon for Mozilla Thunderbird"
DESCRIPTION = "This package contains the Enigmail OpenPGP Addon for Mozilla Thunderbird 78. \
The addon will assist the migration from Enigmail to Thunderbird's built-in \
OpenPGP support."
LICENSE = "MPL-2.0"

PV = "2.2.4"

RPM_NAME = "enigmail-2.2.4-1.9.aarch64.rpm"
RPM_HASH = "ac86f7304e2a45466388e15a491004d90b79d6ed15a0b5760f9f5efb67e2dafb2d609998fe6d95674268608ad7020346eb7e0f750fa34b825c46d42f17327f2f"

RPROVIDES:${PN} += "enigmail \
enigmail(aarch-64) \
metainfo() \
metainfo(enigmail.appdata.xml)"
RDEPENDS:${PN} += "MozillaThunderbird \
gpg2 \
pinentry-gui"

inherit rpm
