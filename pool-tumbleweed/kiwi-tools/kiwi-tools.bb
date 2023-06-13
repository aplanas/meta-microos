SUMMARY = "KIWI - Collection of Boot Helper Tools"
DESCRIPTION = "This package contains a small set of helper tools used for the \
kiwi created initial ramdisk which is used to control the very \
first boot of an appliance. The tools are not meant to be used \
outside of the scope of kiwi appliance building."
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "kiwi-tools-9.24.61-1.1.aarch64.rpm"
RPM_HASH = "75038a26ed9d64bf5f3fba016a223a58a6e29a7d19bb3707e7fc4645c79a208cec0c698ef8ff339ae48f007f3d793d27a0a23a2e916a38034fec1c3553c642d5"

RPROVIDES:${PN} += "kiwi-tools \
kiwi-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
