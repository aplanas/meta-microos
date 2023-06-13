SUMMARY = "SMB module for OpenVAS Scanner"
DESCRIPTION = "This is the smb module for the OpenVAS Scanner. It includes libraries \
(openvas-wmiclient/openvas-wincmd) to interface with Microsoft Windows \
Systems through the Windows Management Instrumentation API and a \
winexe binary to execute processes remotely on that system."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.5"

RPM_NAME = "openvas-smb-1.0.5-2.1.aarch64.rpm"
RPM_HASH = "a2d408e24418e57097c93ecd3d986c06e828e7483755b32d8b142b3173f9c138f276700726275d8ce13214572c22ba6d3a14e47f378323120f72badc83e9e48c"

RPROVIDES:${PN} += "openvas-smb \
openvas-smb(aarch-64) \
winexe \
wmic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasn1.so.8()(64bit) \
libasn1.so.8(HEIMDAL_ASN1_1.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcom_err.so.2()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgssapi.so.3()(64bit) \
libgssapi.so.3(HEIMDAL_GSS_2.0)(64bit) \
libhdb.so.9()(64bit) \
libhdb.so.9(HEIMDAL_HDB_1.0)(64bit) \
libkrb5.so.26()(64bit) \
libkrb5.so.26(HEIMDAL_KRB5_2.0)(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit)"

inherit rpm
