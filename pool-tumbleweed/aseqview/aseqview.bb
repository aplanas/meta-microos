SUMMARY = "ALSA Sequencer Event Viewer"
DESCRIPTION = "ASeqView is an ALSA sequencer user client that works as an event viewer \
and event filter.  It visualizes received events, such as note on and \
off, controls, and pitch wheels, using bar graphs as seen in many \
sequencer applications."
LICENSE = "GPL-2.0-only"

PV = "0.2.8"

RPM_NAME = "aseqview-0.2.8-4.9.aarch64.rpm"
RPM_HASH = "69e800af9a6d0483b9108d3fb1b1019544574960f4350157352945c9a091e3e2fc9cdd994dbd6f9674f28677a79f03b7209d918d5585133339c448a5808c2ff1"

RPROVIDES:${PN} += "aseqview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
