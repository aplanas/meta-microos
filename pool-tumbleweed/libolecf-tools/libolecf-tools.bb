SUMMARY = "Tools to access the OLE 2 Compound File (OLECF) format"
DESCRIPTION = "Tools to access the OLE 2 Compound File (OLECF) format. The OLE 2 \
Compound File format is used to store certain versions of Microsoft \
Office files, thumbs.db and other file formats."
LICENSE = "LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "libolecf-tools-20221024-4.1.aarch64.rpm"
RPM_HASH = "0ad2ec2c0dd210b6a219ef62bc7dbc37bc47a5d4905bfbcde11291c01a72635529bdd22acc1909964beca16cb20a06a911bcdda15f6285ef85b5b002a8ef6af7"

RPROVIDES:${PN} += "libolecf-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libfdatetime.so.1 \
libfguid.so.1 \
libfole.so.1 \
libolecf.so.1 \
libolecf1"

inherit rpm
