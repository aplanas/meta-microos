SUMMARY = "Clipboard / Cutbuffer management helper"
DESCRIPTION = "X servers use two schemes to copy text between applications. The first one \
(old and deprecated) is the cutbuffer. The other scheme is the selection. \
Recent desktop applications (GNOME, KDE, ...) use two selections: the \
PRIMARY and the CLIPBOARD. The PRIMARY selection is used when you select \
some text with the mouse. You usually paste it using the middle button. The \
CLIPBOARD selection is used when you copy text by using, for example, \
the Edit/Copy menu. You may paste it using the Edit/Paste menu. \
 \
Windows VNC clients keep the Windows clipboard synchronized with the \
cutbuffer, but not with the selections. And since recent applications \
don't use the cutbuffer, the server's CLIPBOARD is never synchronized \
with Windows' one. \
 \
Autocutsel tracks changes in the server's cutbuffer and CLIPBOARD \
selection. When the CLIPBOARD is changed, it updates the cutbuffer. When \
the cutbuffer is changed, it owns the CLIPBOARD selection. The cutbuffer \
and CLIPBOARD selection are always synchronized. Since the VNC client \
synchronizes the Windows' clipboard and the server's cutbuffer, all \
three 'clipboards' are always kept synchronized."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "autocutsel-0.10.1-1.7.aarch64.rpm"
RPM_HASH = "39f087d5a735d2a57e4e38f2b2c77320960784c8c29f78cef733a12e9c7b2cfc6e602024250a46fcc86186df77af5bc153651549f4898a1374d82e4fad383432"

RPROVIDES:${PN} += "autocutsel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6"

inherit rpm
