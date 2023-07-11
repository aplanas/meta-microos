SUMMARY = "A Cat Catches Your Mouse"
DESCRIPTION = "A nice program that changes your cursor into a cat playing with your \
mouse cursor.  The manual page shows more possibilities to change your \
cursor."
LICENSE = "SUSE-Public-Domain"

PV = "1.2.sakura.5"

RPM_NAME = "oneko-1.2.sakura.5-1.9.aarch64.rpm"
RPM_HASH = "fcc20f7861304b4d479a747d9570623feb2ce356ef753a79e6ea45f26209ec7f75138a51f3004a9a89abb070af073928c1c1741c41b971c622a09249d43d93a0"

RPROVIDES:${PN} += "oneko"

RDEPENDS:${PN} += "libX11.so.6 \
libXext.so.6 \
libc.so.6"

inherit rpm
