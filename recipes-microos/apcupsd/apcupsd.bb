SUMMARY = "APC UPS Daemon (Powerful Daemon for APC UPSs)"
DESCRIPTION = "Controls and monitors the status of an APC UPS under Linux. Allows your \
computer or server to run for a specified length of time on UPS power \
then executes a controlled shutdown in the case of an extended power \
failure. Find APC on the Internet at http://www.apc.com/. \
 \
APC also made their PowerChute plus available for download at \
http://www.apc.com/tools/download/."
LICENSE = "GPL-2.0-only"

PV = "3.14.14"

RPM_NAME = "apcupsd-3.14.14-15.1.aarch64.rpm"
RPM_HASH = "109bc88881e68c6f4404d295a9583e8eb48eefe3ac1f57d0c658d29a2390cd699f1107cb0684f02af1ab4c6ffa932fa377164d93f8ad98d65e9ead7d25ec202b"

RPROVIDES:${PN} += "apcupsd apcupsd(aarch-64) config(apcupsd)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/mkdir /usr/bin/sh /usr/bin/touch fillup grep ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libusb-0.1.so.4()(64bit) libwrap.so.0()(64bit) mailx sed systemd util-linux-tty-tools"

inherit rpm
