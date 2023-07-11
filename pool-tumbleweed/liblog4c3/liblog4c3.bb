SUMMARY = "A library of C for flexible logging to files, syslog and other destinations"
DESCRIPTION = "Log4c is a library of C for flexible logging to files, syslog and other \
destinations. It is modeled after the Log for Java library \
(http://jakarta.apache.org/log4j/), staying as close to their API as is \
reasonable."
LICENSE = "LGPL-2.1+"

PV = "1.2.4"

RPM_NAME = "liblog4c3-1.2.4-5.27.aarch64.rpm"
RPM_HASH = "732ece6a3815746cc235c8ca2c9096d2ae1c952d4458f189a9aee5d84fdf58ebf7b3a4f3a1782b51adc7a30390877a01c7f5c4584bc733b64e2c013813b76973"

RPROVIDES:${PN} += "liblog4c.so.3 \
liblog4c3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1"

inherit rpm
