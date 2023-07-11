SUMMARY = "Tools to access the OLE 2 Compound File (OLECF) format"
DESCRIPTION = "Tools to access the OLE 2 Compound File (OLECF) format. The OLE 2 \
Compound File format is used to store certain versions of Microsoft \
Office files, thumbs.db and other file formats."
LICENSE = "LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "libolecf-tools-20221024-3.8.aarch64.rpm"
RPM_HASH = "7558b2dc8f1424af023dca72b034a00b16e8ca1466d0c39273242bc213a32496e0d115ab24c3f73b8764169c8bf891efbead906157ca5a1e958711f24796bc31"

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
