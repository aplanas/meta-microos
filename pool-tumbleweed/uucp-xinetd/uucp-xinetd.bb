SUMMARY = "Taylor UUCP using xinetd"
DESCRIPTION = "Unix to Unix copy with xinetd setup instead of using modern systemd \
service units."
LICENSE = "GPL-2.0-or-later"

PV = "1.07"

RPM_NAME = "uucp-xinetd-1.07-4.4.aarch64.rpm"
RPM_HASH = "f65a2d27559f87360acf549557f588537668b11a21ca9705111aee0a9b5d293d1fe2d89ee3e100f1031494587a5ed78958911663cf1d54223be654ab9e80fd88"

RPROVIDES:${PN} += "config-uucp-xinetd \
uucp-xinetd"

RDEPENDS:${PN} += "uucp \
xinetd"

inherit rpm
