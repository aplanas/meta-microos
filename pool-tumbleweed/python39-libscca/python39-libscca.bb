SUMMARY = "Library and tools to access the Windows Prefetch File (PF) format"
DESCRIPTION = "Library and tools to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20230716"

RPM_NAME = "python39-libscca-20230716-2.1.aarch64.rpm"
RPM_HASH = "8cbb6ccaf2c85d655703a1ee9021b4e37b9f2a8b9e4102a57eea8f07ea8a35989af2b22f9950526b2a19250be115039dc5a70bd77354a27ee491370e41d6bfa5"

RPROVIDES:${PN} += "python39-libscca"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libscca.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
