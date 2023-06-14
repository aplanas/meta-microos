SUMMARY = "Micro-Blogging Client for KDE"
DESCRIPTION = "A micro-blogging client for the K Desktop Environment. \
The name comes from an ancient Persian word which means Sparrow. \
It currently supports twitter.com and identi.ca services."
LICENSE = "GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "choqok-devel-1.7.0-3.10.aarch64.rpm"
RPM_HASH = "b63736c8011519d49ad8c650e27cc072b64dbfa083e6aeadb7a3c2c1a7afad766472f0a521033efd06d4cf5b0d9e24ceb2be7a2456370e65c700977ac91796da"

RPROVIDES:${PN} += "choqok-devel"

RDEPENDS:${PN} += "choqok"

inherit rpm
