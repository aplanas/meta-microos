SUMMARY = "Limited cdrecord Compatibility Wrapper"
DESCRIPTION = "cdrskin is a limited cdrecord compatibility wrapper which allows to use most of \
the libburn features from the command line."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.4"

RPM_NAME = "cdrskin-1.5.4-1.10.aarch64.rpm"
RPM_HASH = "270cfd245039778f13f225811870a7e4b271df66f50d928b267c09af9ecf7673ecf5eef9e89801b4a318538f75f9d79b2dd60f11ad2bd3eeb5963f392fd5dde7"

RPROVIDES:${PN} += "cdrskin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libburn.so.4 \
libc.so.6"

inherit rpm
