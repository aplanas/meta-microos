SUMMARY = "Check MRTGEXT NLM running"
DESCRIPTION = "This plugin attempts to contact the MRTGEXT NLM running on a Novell server to \
gather the requested system information."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-nwstat-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "89929390bb77e572ed7f229fda26885d1e5940ef9f9b7fb7a80e32f62e992517edd3dbd310643345857ae7ebda3d2f9ef1aa44cb01e8a11bfb24090b5872387e"

RPROVIDES:${PN} += "monitoring-plugins-nwstat \
nagios-plugins-nwstat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
