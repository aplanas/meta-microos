SUMMARY = "Library For Reading PhotoCD Images"
DESCRIPTION = "Libraries for reading PhotoCD images."
LICENSE = "GPL-2.0+"

PV = "1.0.1"

RPM_NAME = "libpcd2-1.0.1-9.29.aarch64.rpm"
RPM_HASH = "4ff0af4ebe5f09bb0e1c9dc5073677d6ed64b058ec2c4fae9efb84d8aba55101ab0f070f949662a6cebfdfe542a08366cc136bda1c58c871fe97a41c70231a80"

RPROVIDES:${PN} += "libpcd.so.2 \
libpcd2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
