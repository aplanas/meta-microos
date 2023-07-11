SUMMARY = "Library and tools to access the OLE 2 Compound File (OLECF) format"
DESCRIPTION = "Library and tools to access the OLE 2 Compound File (OLECF) format. \
The OLE 2 Compound File format is used to store certain versions of \
Microsoft Office files, thumbs.db and other file formats."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "python39-libolecf-20221024-3.8.aarch64.rpm"
RPM_HASH = "e9bb45bcf777116b7d5db6df392b29940a510b2535d7f465345ebfa75e149066ab09c19f1c4b14c9db6584713d224cd542018d3ae9489f03f5be2623de907b2b"

RPROVIDES:${PN} += "python39-libolecf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libfguid.so.1 \
libolecf.so.1 \
python-abi"

inherit rpm
