SUMMARY = "Tools to access the OLE 2 Compound File (OLECF) format"
DESCRIPTION = "Tools to access the OLE 2 Compound File (OLECF) format. The OLE 2 \
Compound File format is used to store certain versions of Microsoft \
Office files, thumbs.db and other file formats."
LICENSE = "LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "libolecf-tools-20221024-3.9.aarch64.rpm"
RPM_HASH = "819ad84dafc9d17ee3f70c58efd88ef5a618ac0bf3f4a6b41c01f10baee83430668010c705fb735270185c2e752125b2c9949a33d056cf86ee424fdc1e6f2129"

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
