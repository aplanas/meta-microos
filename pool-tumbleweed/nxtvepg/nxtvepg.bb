SUMMARY = "Nextview EPG Decoder and Browser"
DESCRIPTION = "In this software package, find a decoder for Nextview--an electronic TV \
program guide for the analog domain (as opposed to the various digital \
EPGs that come with most digital broadcasts). It allows you to decode \
and browse TV program listings for most of the major networks in \
Germany, Austria, France, and Switzerland. \
 \
Currently, Nextview EPG is transmitted by: * In Germany and Austria: \
   Kabel1, 3Sat, RTL-II, EuroNews (coverage: apx. 31 networks) \
 \
* In Switzerland: SF1, TSR1, TSI1, EuroNews, 3sat, Kabel1 (coverage: \
   apx. 37 networks) \
 \
* In France: Canal+, M6 (coverage: 8 networks) \
 \
* In Turkey: TRT-1 (coverage: 17 networks)"
LICENSE = "GPL-2.0-or-later"

PV = "2.8.1"

RPM_NAME = "nxtvepg-2.8.1-26.13.aarch64.rpm"
RPM_HASH = "2e6e1ae9e3bbb73192398a81c0bcee2b66df1c716c4f2432d6c70542dfcb0ae64083eabe4b80a69b1d3853b9cf8c5981030b0814340769482cb7c3e39467d31a"

RPROVIDES:${PN} += "nxtvepg"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXmu.so.6 \
libc.so.6 \
libm.so.6 \
libtcl8.6.so \
libtk8.6.so"

inherit rpm
