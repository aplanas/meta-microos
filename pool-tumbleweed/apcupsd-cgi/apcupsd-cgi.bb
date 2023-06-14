SUMMARY = "Web interface for apcupsd"
DESCRIPTION = "A CGI interface to the APC UPS monitoring daemon."
LICENSE = "GPL-2.0-only"

PV = "3.14.14"

RPM_NAME = "apcupsd-cgi-3.14.14-15.1.aarch64.rpm"
RPM_HASH = "ce070cc31e4307da21ab658a341c5e0b9fdff58c377bacda63e62bfd95953829bf732e35ccfd61370715fbdb400fc71c17930fd91660475a73bc202e24816474"

RPROVIDES:${PN} += "apcupsd-cgi \
config-apcupsd-cgi"

RDEPENDS:${PN} += "apcupsd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3"

inherit rpm
