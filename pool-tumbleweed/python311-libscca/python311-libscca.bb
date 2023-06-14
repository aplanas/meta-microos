SUMMARY = "Library and tools to access the Windows Prefetch File (PF) format"
DESCRIPTION = "Library and tools to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20221027"

RPM_NAME = "python311-libscca-20221027-3.7.aarch64.rpm"
RPM_HASH = "6b729dd871eb661019650b50d06def9f0b9f55f773caeda96c2d501198d1dbc371e1e662a21aa88c53bf43ae0e96cd88122e2cc6aa9157c0a7a815e3c3f00485"

RPROVIDES:${PN} += "python311-libscca"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libscca.so.1 \
python-abi"

inherit rpm
