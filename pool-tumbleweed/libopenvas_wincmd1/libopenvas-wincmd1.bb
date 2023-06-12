SUMMARY = "Support libraries for GVM"
DESCRIPTION = "The support libraries for the Greenbone Vulnerability Management framework."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.5"

RPM_NAME = "libopenvas_wincmd1-1.0.5-2.1.aarch64.rpm"
RPM_HASH = "510c5258658a36ec5c18074f1cf2f85370a1c3bf75a116e6becfb983a8ac9bcdeb8efea25223a4e43bcc973cad326e0316559f8959f6349c11200c767f682fe5"

RPROVIDES:${PN} += "libopenvas_wincmd.so.1()(64bit) \
libopenvas_wincmd.so.1(OPENVAS_WINCMD)(64bit) \
libopenvas_wincmd1 \
libopenvas_wincmd1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasn1.so.8()(64bit) \
libasn1.so.8(HEIMDAL_ASN1_1.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcom_err.so.2()(64bit) \
libglib-2.0.so.0()(64bit) \
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
