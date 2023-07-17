SUMMARY = "Taylor UUCP using xinetd"
DESCRIPTION = "Unix to Unix copy with xinetd setup instead of using modern systemd \
service units."
LICENSE = "GPL-2.0-or-later"

PV = "1.07"

RPM_NAME = "uucp-xinetd-1.07-5.1.aarch64.rpm"
RPM_HASH = "93536844c389d899aaf1d69ce6fcc01b7c3f7857e887eb9fe7f39f6be41c2f8ae0caa995b32f4a6944904e2864fc68550e66840cfedc94e480513ea31e52f624"

RPROVIDES:${PN} += "config-uucp-xinetd \
uucp-xinetd"

RDEPENDS:${PN} += "uucp \
xinetd"

inherit rpm
