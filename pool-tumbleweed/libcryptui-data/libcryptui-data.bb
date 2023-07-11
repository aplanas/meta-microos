SUMMARY = "Data files for libcryptui, a PGP key prompting library"
DESCRIPTION = "Libcryptui is a library used for prompting for PGP keys."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.2"

RPM_NAME = "libcryptui-data-3.12.2-10.4.aarch64.rpm"
RPM_HASH = "d81284633c65d59a2ce2d6e9899ecaab61b451c98441c08ba72ca480c2c1282b7991b3721fff72e23d0cef20101c5c422ce332f37233069e9f382bf0a1480e30"

RPROVIDES:${PN} += "libcryptui-data"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
