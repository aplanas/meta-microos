SUMMARY = "UDisks2 integration for Clevis"
DESCRIPTION = "Automatically unlock LUKS devices in UDisks2 with Clevis."
LICENSE = "GPL-3.0-or-later"

PV = "19"

RPM_NAME = "clevis-udisks2-19-2.1.aarch64.rpm"
RPM_HASH = "cd07b201617c786990b84995b5e265d6e077c8877169353a79fd86106e6cb7bafc2862f3df72d40be8a8f8408905da41764f4d308e2560ca292962754d58ac98"

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
