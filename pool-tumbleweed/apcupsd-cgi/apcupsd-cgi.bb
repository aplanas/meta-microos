SUMMARY = "Web interface for apcupsd"
DESCRIPTION = "A CGI interface to the APC UPS monitoring daemon."
LICENSE = "GPL-2.0-only"

PV = "3.14.14"

RPM_NAME = "apcupsd-cgi-3.14.14-15.2.aarch64.rpm"
RPM_HASH = "bf07bc753b3f4176cead65811f7c7aa9ebe3567478d85c4eb423434e00f1804781a0c87e30e33ba819727565bba863554c9159a3a9e1618c4e034c93fad3fbb6"

RPROVIDES:${PN} += "apcupsd-cgi \
config-apcupsd-cgi"

RDEPENDS:${PN} += "apcupsd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3"

inherit rpm
