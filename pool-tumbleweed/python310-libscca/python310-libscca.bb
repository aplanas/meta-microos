SUMMARY = "Library and tools to access the Windows Prefetch File (PF) format"
DESCRIPTION = "Library and tools to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20230716"

RPM_NAME = "python310-libscca-20230716-1.1.aarch64.rpm"
RPM_HASH = "cce902477bb9b148fce0b2601e091e253c1d028e4adcf112b260512e5752c0a62f09cbedcbc73bbd970d15b3757d21be0cd00c5a56401e2c6478fa55b37671c4"

RPROVIDES:${PN} += "python310-libscca"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libscca.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
