SUMMARY = "An MS Windows Emulator"
DESCRIPTION = "Wine is a compatibility layer capable of running Windows \
applications. Instead of simulating internal Windows logic like a \
virtual machine or emulator, Wine translates Windows API calls into \
POSIX calls on-the-fly, eliminating the performance and memory \
penalties of other methods and allowing you to cleanly integrate \
Windows applications into your desktop. \
 \
 \
This WINE flavor contains the 'staging' development patchset \
on top of the regular Wine release. \
 \
 \
 \
 \
 \
 \
You can run your Windows executables with it and write your Windows \
programs under Linux and link against the WINE libraries. It is not \
necessary to have a Windows installation to run WINE. \
 \
Refer to /usr/share/doc/packages/wine/README.SUSE. There is more \
documentation available in that directory. Read 'man wine' for further \
information. \
 \
You can invoke wine by entering 'wine program.exe'. Configure it by \
running 'winecfg'."
LICENSE = "LGPL-2.1-or-later"

PV = "6.17"

RPM_NAME = "wine-staging-6.17-1.1.aarch64.rpm"
RPM_HASH = "833052f23e7743f490f2eab73ff23886c660ac6b1ff4f02563668b87b5d94a3212365eb61a0565f1dc41f32335b884fff65ba4c2b4af0530199e9dd5ac4e6e04"

RPROVIDES:${PN} += "config-wine-staging \
libwine.so.1 \
wine \
wine-mp3 \
wine-staging"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libFAudio.so.0 \
libGL.so.1 \
libOSMesa.so.8 \
libOpenCL.so.1 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libXcomposite.so.1 \
libXcursor.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXrender.so.1 \
libXxf86vm.so.1 \
libasound.so.2 \
libc.so.6 \
libcups.so.2 \
libdbus-1.so.3 \
libdl.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgphoto2-port.so.12 \
libgphoto2.so.6 \
libgsm.so.1 \
libgssapi-krb5.so.2 \
libgstaudio-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libjpeg.so.8 \
libkrb5.so.3 \
liblber-2.4.so.2 \
liblcms2.so.2 \
libldap-r-2.4.so.2 \
libm.so.6 \
libmpg123.so.0 \
libopenal.so.1 \
libpcap.so.1 \
libpng16.so.16 \
libpthread.so.0 \
libpulse.so.0 \
libresolv.so.2 \
librt.so.1 \
libsane.so.1 \
libtiff.so.5 \
libudev.so.1 \
libunwind.so.8 \
libusb-1.0.so.0 \
libv4l2.so.0 \
libvkd3d-shader.so.1 \
libvkd3d.so.1 \
libvulkan.so.1 \
libxml2.so.2 \
libxslt.so.1 \
samba-winbind"

inherit rpm
