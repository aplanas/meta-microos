SUMMARY = "Tools to access the OLE 2 Compound File (OLECF) format"
DESCRIPTION = "Tools to access the OLE 2 Compound File (OLECF) format. The OLE 2 \
Compound File format is used to store certain versions of Microsoft \
Office files, thumbs.db and other file formats."
LICENSE = "LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "libolecf-tools-20221024-3.5.aarch64.rpm"
RPM_HASH = "3362744154a57e73bc7f1b59dbcba53eac7ce9e8cc0de7155f013f77e8e9cb764eefed71c448eef27ca549b92702a83339e3f6ff4bad1d476753a4db3d23bf74"

RPROVIDES:${PN} += "libolecf-tools \
libolecf-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libcfile.so.1()(64bit) \
libcfile.so.1(V_20220106)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit) \
libcpath.so.1()(64bit) \
libcpath.so.1(V_20220108)(64bit) \
libfdatetime.so.1()(64bit) \
libfdatetime.so.1(V_20220112)(64bit) \
libfguid.so.1()(64bit) \
libfguid.so.1(V_20220113)(64bit) \
libfole.so.1()(64bit) \
libfole.so.1(V_20220115)(64bit) \
libolecf.so.1()(64bit) \
libolecf.so.1(V_20221024)(64bit) \
libolecf1"

inherit rpm
