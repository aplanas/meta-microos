SUMMARY = "UDisks2 integration for Clevis"
DESCRIPTION = "Automatically unlock LUKS devices in UDisks2 with Clevis."
LICENSE = "GPL-3.0-or-later"

PV = "19"

RPM_NAME = "clevis-udisks2-19-2.2.aarch64.rpm"
RPM_HASH = "6d6c71c3b8d9a08419b6c93b8fa3ebfd137b6c864398c42daa7fa86d55467b189430280507fd7f0cffd2dd84bc2b6d92bae4a7d42344ccf8d66b91e9640c0416"

RPROVIDES:${PN} += "clevis-udisks2"

RDEPENDS:${PN} += "clevis-luks \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libcryptsetup.so.12 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjansson.so.4 \
libluksmeta.so.0 \
libudisks2.so.0"

inherit rpm
