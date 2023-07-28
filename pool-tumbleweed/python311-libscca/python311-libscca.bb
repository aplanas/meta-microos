SUMMARY = "Library and tools to access the Windows Prefetch File (PF) format"
DESCRIPTION = "Library and tools to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20230716"

RPM_NAME = "python311-libscca-20230716-1.1.aarch64.rpm"
RPM_HASH = "09ac1b395f3c9824a5084969f75031925660321c2332f8ab207386e76ebcb64c838188860b4355ae88ced3089bbd681c99e8bafb5b2f61cff25bead9c702be9f"

RPROVIDES:${PN} += "python3-libscca \
python311-libscca"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libscca.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
