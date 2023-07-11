SUMMARY = "KIWI - Collection of Boot Helper Tools"
DESCRIPTION = "This package contains a small set of helper tools used for the \
kiwi created initial ramdisk which is used to control the very \
first boot of an appliance. The tools are not meant to be used \
outside of the scope of kiwi appliance building."
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "kiwi-tools-9.24.61-1.2.aarch64.rpm"
RPM_HASH = "4c55cd01ba3eea2306c2eed2e5eebfce5c8bc12ea8e47df540d710d0d0aaf0f498220db0d9822e9e2d67354ab1a7f562cceba9c15ce87d2631d549a49fd9a428"

RPROVIDES:${PN} += "kiwi-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
