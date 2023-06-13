SUMMARY = "A Small Utility for Updating a Dynamic DNS Service"
DESCRIPTION = "ez-ipupdate is a small utility for updating your hostname for any of \
the dynamic DNS services offered at: \
 \
* http://www.ez-ip.net \
 \
* http://www.justlinux.com \
 \
* http://www.dhs.org \
 \
* http://www.dyndns.org \
 \
* http://www.ods.org \
 \
* http://gnudip.cheapnet.net (GNUDip) \
 \
* http://www.dyn.ca (GNUDip) \
 \
* http://www.tzo.com \
 \
* http://www.easydns.com \
 \
* http://www.dyns.cx \
 \
* http://www.hn.org \
 \
* http://www.zoneedit.com \
 \
* http://www.joker.com"
LICENSE = "GPL-2.0+"

PV = "3.0.11b8"

RPM_NAME = "ez-ipupdate-3.0.11b8-292.7.aarch64.rpm"
RPM_HASH = "2989d61843eeeac3dd86c8ae4540abcad6b052898f1569fe6903bb3a538dcfb3cdf035f8fd5fa862fae8b59f57d39a67978d1143c8e09d4160ee43c4c49a9fc4"

RPROVIDES:${PN} += "config(ez-ipupdate) \
ez-ipupdate \
ez-ipupdate(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
systemd"

inherit rpm
