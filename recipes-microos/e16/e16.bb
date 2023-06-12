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
e16(aarch-64) \
enlight \
libhack.so()(64bit) \
windowmanager"
RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
/usr/bin/perl \
imlib2-loaders \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libICE.so.6()(64bit) \
libImlib2.so.1()(64bit) \
libSM.so.6()(64bit) \
libX11.so.6()(64bit) \
libXcomposite.so.1()(64bit) \
libXdamage.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXft.so.2()(64bit) \
libXinerama.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libXrender.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgobject-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangoxft-1.0.so.0()(64bit)"

inherit rpm
