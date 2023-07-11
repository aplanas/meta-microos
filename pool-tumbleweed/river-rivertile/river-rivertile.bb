SUMMARY = "Tiled layout generator for river"
DESCRIPTION = "A layout generator for river. It provides a simple tiled layout with split main/secondary stacks. \
The initial state may be configured with various options passed on startup. Some values may additionally be modified while rivertile is running with the help of riverctl."
LICENSE = "GPL-3.0-only"

PV = "0.2.4+g953"

RPM_NAME = "river-rivertile-0.2.4+g953-1.1.aarch64.rpm"
RPM_HASH = "613175cfcc375bb0479f1557d81f5a63dcd14a51858a12665ba7423a85942e026055647242bdd3b353a3ce675e212925d5dbc50a099af497eec3612ed83d0713"

RPROVIDES:${PN} += "river-rivertile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0 \
river"

inherit rpm
