SUMMARY = "Base station controller for a GSM stack"
DESCRIPTION = "An implementation of the minimal subset of the major backend \
components of a GSM network, such as BSC, MSC, HLR, EIR. Using a \
commercial GSM BTS and attaching it to a Linux system running the \
OpenBSC software allows you to run your own GSM 'network in a box'. \
 \
OsmoBSC can run in one of two modes: \
* as OsmoBSC, exposing an A interface towards an external MSC, or \
* as OsmoNITB (Network In The Box), which implements a minimal subset \
  of the BSC, MSC. SMSC and HLR"
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "openbsc-1.4.1-1.11.aarch64.rpm"
RPM_HASH = "14bb674de75df10eaab27f0893c876026a1c715ce7075bc4d8c972f1ab7e4023723c5db0f2d94383845df3622269b90601276476588a3caa409935eedbf792d5"

RPROVIDES:${PN} += "config-openbsc \
openbsc \
osmocom-bsc-sccplite \
osmocom-nitb"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libdbi-drivers-dbd-sqlite3 \
libdbi.so.3 \
libosmoabis.so.10 \
libosmocore.so.20 \
libosmoctrl.so.0 \
libosmogsm.so.18 \
libosmovty.so.9 \
libsmpp34.so.1 \
libtalloc.so.2"

inherit rpm
