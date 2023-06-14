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

RPROVIDES:${PN} += "rdesktop"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcursor.so.1 \
libXrandr.so.2 \
libao.so.4 \
libasound.so.2 \
libc.so.6 \
libgmp.so.10 \
libgnutls.so.30 \
libgssapi-krb5.so.2 \
libhogweed.so.6 \
libnettle.so.8 \
libpcsclite.so.1 \
libsamplerate.so.0 \
libtasn1.so.6"

inherit rpm
