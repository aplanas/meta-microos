SUMMARY = "Library for the Expert Witness Compression Format (EWF)"
DESCRIPTION = "libewf is a library for support of the Expert Witness Compression \
Format (EWF). It supports both the SMART format (EWF-S01) and the \
EnCase format (EWF-E01). libewf allows you to read and write media \
information within the EWF files. libewf allows to read files created \
by EnCase 1 to 6, linen and FTK Imager."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230212"

RPM_NAME = "python311-libewf-20230212-2.3.aarch64.rpm"
RPM_HASH = "8aeb7c4be2aab71af679f22ca19a1fd91e5cb5dc681fb3bfde4385969bb948509f43c66ded0015d08a3d75bc2a5dc5998cacd7b2bedd10fbecdfb59f38e289ff"

RPROVIDES:${PN} += "python311-libewf \
python311-libewf(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libewf.so.3()(64bit) \
libewf.so.3(V_20230212)(64bit) \
python(abi)"

inherit rpm
