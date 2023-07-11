SUMMARY = "A caching DNS proxy for small networks or dialin accounts"
DESCRIPTION = "pdnsd is a proxy DNS daemon with permanent (disk-)cache and the ability \
to serve local records. It is designed to detect network outages or hangups \
and to prevent DNS-dependent applications like Netscape Navigator from hanging. \
 \
The original author of pdnsd is Thomas Moestl, but pdnsd is no longer maintained \
by him. This is an extensively revised version by Paul A. Rombouts. \
For a description of the changes see http://www.phys.uu.nl/~rombouts/pdnsd.html \
and the file README.par in /usr/share/doc/packages/pdnsd-doc."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.9a"

RPM_NAME = "pdnsd-1.2.9a-10.9.aarch64.rpm"
RPM_HASH = "e574e5621645c4e2437c2786670c2286d465f59566db618c7eb019078f3729ae81dce927105135ac438409ce4788210f37943b777a92556f6c2d01e1799403ad"

RPROVIDES:${PN} += "config-pdnsd \
pdnsd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
