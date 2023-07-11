SUMMARY = "Nemo extension for filename encoding repair"
DESCRIPTION = "This is a Nemo extension which repairs filename which uses wrong \
encoding in Nemo. This extension provides the context menu for any \
file whose filename uses wrong encoding, so that you cannot read the \
filename in Nemo. \
 \
You can find a candidate for filename in context menu or submenu. \
This extension also provides a decoded name for URL encoded filename."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-repairer-5.2.0-3.6.aarch64.rpm"
RPM_HASH = "c687080dd29a952ceaeb0d26f655c24f415c781434a4be1d5e209ced48c575189207119f8bd602f520c1172c6f59c732f041780e6cc8c6adf12aab0a268e86eb"

RPROVIDES:${PN} += "libnemo-filename-repairer.so \
nemo-extension-repairer \
nemo-repairer"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnemo-extension.so.1 \
nemo"

inherit rpm
