SUMMARY = "XS implementation of parts of Class::Load"
DESCRIPTION = "This module provides an XS implementation for portions of Class::Load. See \
Class::Load for API details."
LICENSE = "Artistic-2.0"

PV = "0.10"

RPM_NAME = "perl-Class-Load-XS-0.10-1.33.aarch64.rpm"
RPM_HASH = "5ce179d4e03dc7450a73841e28e0017f3a9ac51ae9db8496bc65ccc7590958a33fc56d0e9e4e6493196750dbc2dacbc478f64c0c5faec7e1e5b8afce7e13cbc9"

RPROVIDES:${PN} += "perl-Class--Load--XS \
perl-Class-Load-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-Class--Load"

inherit rpm
