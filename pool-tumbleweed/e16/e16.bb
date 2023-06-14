SUMMARY = "A Window Manager for the X Window System"
DESCRIPTION = "Enlightenment is a window manager for the X Window System that is \
extensible and configurable looking. It is one of the more \
graphically intense window managers. \
 \
Enlightenment goes beyond managing windows by providing a graphical \
shell from which to work. It allows the user to define their own \
policy down to every last detail."
LICENSE = "GPL-2.0-or-later & MIT-advertising"

PV = "1.0.24"

RPM_NAME = "e16-1.0.24-1.7.aarch64.rpm"
RPM_HASH = "7c453cf6f42608c2a6d854f69d873bd69a3e18ecfbc974b5020a8a17ac0cfaaf3c9d5ca05bc0372e9e4edde058e6335e1dcbf70b5b5e082ae86ed15127dc548d"

RPROVIDES:${PN} += "e16 \
enlight \
libhack.so \
windowmanager"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
/usr/bin/perl \
imlib2-loaders \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libImlib2.so.1 \
libSM.so.6 \
libX11.so.6 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXft.so.2 \
libXinerama.so.1 \
libXrandr.so.2 \
libXrender.so.1 \
libc.so.6 \
libgobject-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangoxft-1.0.so.0"

inherit rpm
