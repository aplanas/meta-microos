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

RPM_NAME = "pdnsd-1.2.9a-10.8.aarch64.rpm"
RPM_HASH = "fd10e83ec4724ea9a490cc04d3a7b38cec08bfacb2aa3b1636ad1ad5c32dd53db822f0f0975738505c22f24e46ab7fec65344b972245304fbd90847eeda30aa3"

RPROVIDES:${PN} += "config-pdnsd \
pdnsd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
