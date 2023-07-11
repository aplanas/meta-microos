SUMMARY = "A collection of helpers for building DLNA applications"
DESCRIPTION = "GUPnP-DLNA is a collection of helpers for building DLNA media sharing \
applications using GUPnP."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "gupnp-dlna-0.12.0-1.11.aarch64.rpm"
RPM_HASH = "2c56320d782010973884824273bb97dab6cb79908d1764b9c676182794a12a0e7e9d037627ccdafb536fa6e17661ed820319a83895ce30858e20694c32789178"

RPROVIDES:${PN} += "gupnp-dlna"

RDEPENDS:${PN} += ""

inherit rpm
