SUMMARY = "A Remote Desktop Protocol client"
DESCRIPTION = "rdesktop is a client for connecting to Windows Remote Desktop \
Services, capable of natively speaking Remote Desktop Protocol (RDP) \
in order to present the user's Windows desktop. rdesktop is known to \
work with Windows server versions ranging from NT 4 terminal server \
to Windows Server 2012 R2."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.0"

RPM_NAME = "rdesktop-1.9.0-4.11.aarch64.rpm"
RPM_HASH = "ba0b52a716b1da04b7bb33e5c5907795cf4e1303f01064dc0179e1073302c7144a0575c771bbcdb2314be3159f437c9a8b89a8d1c84a386579235235ca956c29"

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
