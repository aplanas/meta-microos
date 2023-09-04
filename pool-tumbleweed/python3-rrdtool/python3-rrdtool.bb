SUMMARY = "Python bindings for RRDtool"
DESCRIPTION = "Python RRDtool bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "python3-rrdtool-1.8.0-3.5.aarch64.rpm"
RPM_HASH = "aa2fd1f998bd98fee4f080c8557c6b01297a150cb873364ca7c1bde8e20771da8862f9accfd34d2e4382078a64d193dcc93db473cc15231eeb456a4068e5957b"

RPROVIDES:${PN} += "python3-rrdtool \
python3.11dist-rrdtool \
python3dist-rrdtool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librrd.so.8 \
python-abi \
python3 \
rrdtool"

inherit rpm
