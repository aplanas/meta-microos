SUMMARY = "A Remote Desktop Protocol client"
DESCRIPTION = "rdesktop is a client for connecting to Windows Remote Desktop \
Services, capable of natively speaking Remote Desktop Protocol (RDP) \
in order to present the user's Windows desktop. rdesktop is known to \
work with Windows server versions ranging from NT 4 terminal server \
to Windows Server 2012 R2."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.0"

RPM_NAME = "rdesktop-1.9.0-4.10.aarch64.rpm"
RPM_HASH = "93d8af5711e36e4aaed1910f4f90e00c4c5dd68610f208bd1910510d25a677f3401d1d6967a494d4635f5095836daf3d0dd4f4777f454607ed696ec774503d61"

RPROVIDES:${PN} += "rdesktop \
rdesktop(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXcursor.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libao.so.4()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libhogweed.so.6()(64bit) \
libhogweed.so.6(HOGWEED_6)(64bit) \
libnettle.so.8()(64bit) \
libnettle.so.8(NETTLE_8)(64bit) \
libpcsclite.so.1()(64bit) \
libsamplerate.so.0()(64bit) \
libtasn1.so.6()(64bit) \
libtasn1.so.6(LIBTASN1_0_3)(64bit)"

inherit rpm
