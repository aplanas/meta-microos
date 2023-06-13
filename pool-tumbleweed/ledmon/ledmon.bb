SUMMARY = "Enclosure LED Utilities"
DESCRIPTION = "The ledctl application and ledmon daemon are part of Intel(R) LED \
ControlUtilities. They help to enable LED management for software RAID \
solutions."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "0.97"

RPM_NAME = "ledmon-0.97-1.1.aarch64.rpm"
RPM_HASH = "85df7d500ff7010ba5da4c7770dc49d6fe67b4fdf3954d9e9e7948d87cddc47b9f2526d4c009aced797482a2aa78a3a1b1174f37ba1861f93b5534e9559092ef"

RPROVIDES:${PN} += "ledmon \
ledmon(aarch-64) \
sgpio:/sbin/ledmon \
sgpio:/{/usr/bin}/ledctl"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpci.so.3()(64bit) \
libpci.so.3(LIBPCI_3.0)(64bit) \
libpci.so.3(LIBPCI_3.1)(64bit) \
libpci.so.3(LIBPCI_3.5)(64bit) \
libsgutils2-1.48.so.2()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
systemd"

inherit rpm
