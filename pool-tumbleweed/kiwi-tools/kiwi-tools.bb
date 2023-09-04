SUMMARY = "KIWI - Collection of Boot Helper Tools"
DESCRIPTION = "This package contains a small set of helper tools used for the \
kiwi created initial ramdisk which is used to control the very \
first boot of an appliance. The tools are not meant to be used \
outside of the scope of kiwi appliance building."
LICENSE = "GPL-3.0-or-later"

PV = "9.25.12"

RPM_NAME = "kiwi-tools-9.25.12-1.1.aarch64.rpm"
RPM_HASH = "c59be77bdba4c97bebb2d0cbb387e3d0a18953736f22b4326ec5c31021db5d5938074d67e509972ab5a85684f59780d0ba266f44300b4cc2b2ab77bc9b575439"

RPROVIDES:${PN} += "kiwi-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
