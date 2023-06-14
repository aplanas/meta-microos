SUMMARY = "LIRC driver library"
DESCRIPTION = "The LIRC driver library. To actually use the lirc plugins."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "liblirc_driver0-0.10.1-10.1.aarch64.rpm"
RPM_HASH = "52d6e3ba0c872f9984f5eea5fd65cf0c564a6a207c788b1e73400138b4ba1874d2f9926ef28056a28e3ee9480ab29856dd0dae605c8e1f553fd3b410f6ac19c9"

RPROVIDES:${PN} += "liblirc-driver.so.0 \
liblirc-driver0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblirc.so.0 \
libudev.so.1"

inherit rpm
