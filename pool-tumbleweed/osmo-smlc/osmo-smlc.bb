SUMMARY = "Osmocom Serving Mobile Location Centre"
DESCRIPTION = "OsmoSMLC is the Osmocom Serving Mobile Location Centre. It implements \
the SMLC functionality as specified in 3GPP networks \
Location_Services architecture."
LICENSE = "AGPL-3.0-or-later"

PV = "0.2.3"

RPM_NAME = "osmo-smlc-0.2.3-1.2.aarch64.rpm"
RPM_HASH = "791306b248c318fec630bf2252dadeb660cf95af2ebc0759bea2c36c89e1edab540049446e3adf37740b22691005ee8796410fc9fab3ec3dbe14d7b2936bda00"

RPROVIDES:${PN} += "osmo-smlc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmo-sigtran.so.7 \
libosmocore.so.20 \
libosmoctrl.so.0 \
libosmogsm.so.18 \
libosmovty.so.9 \
libtalloc.so.2"

inherit rpm
