SUMMARY = "Mouse, keyboard and clipboard sharing utility"
DESCRIPTION = "Synergy lets you easily share a single mouse and keyboard between \
multiple computers with different operating systems, each with its own \
display, without special hardware.  It's intended for users with \
multiple computers on their desk since each system uses its own \
display. \
 \
Redirecting the mouse and keyboard is as simple as moving the mouse off \
the edge of your screen.  Synergy also merges the clipboards of all the \
systems into one, allowing cut-and-paste between systems. Furthermore, \
it synchronizes screen savers so they all start and stop together and, \
if screen locking is enabled, only one screen requires a password to \
unlock them all."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.1"

RPM_NAME = "synergy-1.9.1-4.9.aarch64.rpm"
RPM_HASH = "d50e0862d62233d292d6004ba0d9a5f8ed24d563ff7679abcafc44212e39c286e056605a2a0e01fd8cce87bed5c947b6599a3d542a1fd36ed498a22120b07e22"

RPROVIDES:${PN} += "config-synergy \
synergy \
synergy-core \
synergy-plus"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXtst.so.6 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
