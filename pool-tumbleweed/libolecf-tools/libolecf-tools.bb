SUMMARY = "Tools to access the OLE 2 Compound File (OLECF) format"
DESCRIPTION = "Tools to access the OLE 2 Compound File (OLECF) format. The OLE 2 \
Compound File format is used to store certain versions of Microsoft \
Office files, thumbs.db and other file formats."
LICENSE = "LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "libolecf-tools-20221024-3.5.aarch64.rpm"
RPM_HASH = "3362744154a57e73bc7f1b59dbcba53eac7ce9e8cc0de7155f013f77e8e9cb764eefed71c448eef27ca549b92702a83339e3f6ff4bad1d476753a4db3d23bf74"

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
