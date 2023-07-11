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

RPM_NAME = "apcupsd-3.14.14-15.2.aarch64.rpm"
RPM_HASH = "84f499c49659df6d9a55920133d4a6b8bdf423f2bbe51764a2e8ed66e2318d209eda39b70994c8a824d5932b053636dc6117651a4b7ae2ea8316353b4b96aa79"

RPROVIDES:${PN} += "apcupsd \
config-apcupsd"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
grep \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libusb-0.1.so.4 \
libwrap.so.0 \
mailx \
sed \
systemd \
util-linux-tty-tools"

inherit rpm
