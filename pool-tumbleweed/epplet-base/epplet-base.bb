SUMMARY = "Applets for the Enlightenment DR16 Window Manager"
DESCRIPTION = "Epplets are programs designed to work with the Enlightenment Window \
Manager Version 0.16.  Generally they are quite small and \
provide a quick way for a user to perform simple tasks or view \
information."
LICENSE = "GPL-2.0-or-later"

PV = "0.10"

RPM_NAME = "epplet-base-0.10-78.12.aarch64.rpm"
RPM_HASH = "eca9229ae18277ad48559bb49614d574fe0f86af2f16ee25e689bc25c50e3c38fb24cf04b51231a82b824bd77e6b2734d2e4811d2a90bed27e480936a8443953"

RPROVIDES:${PN} += "epplet-base \
libepplet.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libImlib2.so.1 \
libX11.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
