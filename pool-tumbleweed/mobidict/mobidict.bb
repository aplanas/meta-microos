SUMMARY = "A dictionary viewer for AZW/MOBI files"
DESCRIPTION = "A dictionary viewer for AZW/MOBI files."
LICENSE = "GPL-3.0-only"

PV = "1.2"

RPM_NAME = "mobidict-1.2-1.24.aarch64.rpm"
RPM_HASH = "44947d91940793ae869bb7d120a63d1cf544cf63c48771ed47fae7ac3bc56fc53131100f360d916ba505281ee757b4b5a8f51379a5b78e97596982ff35bd730f"

RPROVIDES:${PN} += "mobidict"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
