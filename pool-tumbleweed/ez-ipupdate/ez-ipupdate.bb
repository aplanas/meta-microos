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

RPM_NAME = "ez-ipupdate-3.0.11b8-292.8.aarch64.rpm"
RPM_HASH = "3c936aefa9915c048e4bded4ce3fa1f7e7e561a105a9dd426a03197ceff3bca4c85ba3b0badbebfa53bc423923fc9e934dc670b3d1b01d3f0c98e715078f9ad1"

RPROVIDES:${PN} += "config-ez-ipupdate \
ez-ipupdate"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
systemd"

inherit rpm
