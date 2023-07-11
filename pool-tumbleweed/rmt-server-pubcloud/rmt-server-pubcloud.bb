SUMMARY = "RMT pubcloud extensions"
DESCRIPTION = "This package extends the basic RMT functionality with capabilities \
required for public cloud environments."
LICENSE = "GPL-2.0-or-later"

PV = "2.13"

RPM_NAME = "rmt-server-pubcloud-2.13-1.2.aarch64.rpm"
RPM_HASH = "2e2eb9173097b6a6094675d9c2f1492054f4862b97d1c058df584226c9603c1efeb7c0d4755960648a1dae4ebf539e70248972e10dfe99c49a00289d81ecb91c"

RPROVIDES:${PN} += "config-rmt-server-pubcloud \
rmt-server-configuration \
rmt-server-pubcloud"

RDEPENDS:${PN} += "/usr/bin/sh \
rmt-server"

inherit rpm
