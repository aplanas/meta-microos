SUMMARY = "Library and tools to access the Windows Prefetch File (PF) format"
DESCRIPTION = "Library and tools to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20230716"

RPM_NAME = "python39-libscca-20230716-1.1.aarch64.rpm"
RPM_HASH = "bb494ca045019c2ac70bb5eff14185da071191fc959f158ab66a4fa8a38ccbb50a34ceb8a30f071ffa058339e424606bd6b0d48277b4a164f4a88b5943f1ab2a"

RPROVIDES:${PN} += "python39-libscca"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libscca.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
