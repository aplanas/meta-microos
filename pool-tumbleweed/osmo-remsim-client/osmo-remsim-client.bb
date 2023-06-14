SUMMARY = "Osmocom Remote SIM Client"
DESCRIPTION = "The remsim-client is managing a given phone/modem. It attaches to the \
'cardem' firmware of a SIMtrcace2 (or compatible, such as sysmoQMOD) \
hardware and forwards the SIM card communication to a remsim-bankd, \
under the control of remsim-server."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.2"

RPM_NAME = "osmo-remsim-client-0.2.2-1.21.aarch64.rpm"
RPM_HASH = "d434b766e598c2e033804e7f9f90e4e278e65e871330459466091db32711545c2863822dcaef1605bae5fdae4117c8cdccec06ee05a25139f13d9f1898b6fd5e"

RPROVIDES:${PN} += "osmo-remsim-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libosmo-rspro.so.1 \
libosmoabis.so.10 \
libosmocore.so.20 \
libosmogsm.so.18 \
libosmosim.so.2 \
libtalloc.so.2 \
libusb-1.0.so.0"

inherit rpm
