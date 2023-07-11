SUMMARY = "XS implementation of parts of Class::Load"
DESCRIPTION = "This module provides an XS implementation for portions of Class::Load. See \
Class::Load for API details."
LICENSE = "Artistic-2.0"

PV = "0.10"

RPM_NAME = "perl-Class-Load-XS-0.10-1.32.aarch64.rpm"
RPM_HASH = "bf736dc2cc3e55401f7169307bc3e1d22a586693febf85d3fe2738b0e630af2045695175251823722d64c8ee1d5a5a30e07f68c25be6d26b01f28b51205006df"

RPROVIDES:${PN} += "perl-Class--Load--XS \
perl-Class-Load-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-Class--Load"

inherit rpm
