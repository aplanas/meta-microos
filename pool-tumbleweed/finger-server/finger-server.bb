SUMMARY = "A Server for Showing User Information"
DESCRIPTION = "The finger daemon implements a simple protocol based on RFC1196 that \
provides an interface to the Name and Finger programs at several \
network sites. The program is supposed to return a friendly \
human-oriented status report on either the system at the moment or a \
particular person."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "finger-server-1.3-169.4.aarch64.rpm"
RPM_HASH = "75e8a22bbce519d38b2be4f46afecafc16cff0fcefb520ab4e18b1aae6b2eed695c48587cb3b4dfef03e6e44598e312f2916f45b71145acc9d63ec3b6e086366"

RPROVIDES:${PN} += "finger-server"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnss-usrfiles2 \
netcfg \
systemd"

inherit rpm
