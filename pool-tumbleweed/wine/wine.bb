SUMMARY = "An MS Windows Emulator"
DESCRIPTION = "Wine is a compatibility layer capable of running Windows \
applications. Instead of simulating internal Windows logic like a \
virtual machine or emulator, Wine translates Windows API calls into \
POSIX calls on-the-fly, eliminating the performance and memory \
penalties of other methods and allowing you to cleanly integrate \
Windows applications into your desktop. \
 \
 \
 \
 \
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

PV = "8.9"

RPM_NAME = "wine-8.9-1.2.aarch64.rpm"
RPM_HASH = "38c8427099daa2799151f9ad50b005cf99b07981c9607e25ba5ec235c2354ff90a4ea8a92f54e679bf2e8a5b1c8a408be8617201ed6b7402e7afe121907164e7"

RPROVIDES:${PN} += "bundled-FAudio \
bundled-jpeg \
bundled-libgsm \
bundled-libjxr \
bundled-liblcms2 \
bundled-libpng \
bundled-libxml2 \
bundled-libxslt \
bundled-mpg123 \
bundled-openldap2 \
bundled-tiff \
bundled-vkd3d \
bundled-zlib \
config-wine \
wine \
wine-mp3"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
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
libcapi20.so.3 \
libcups.so.2 \
libdbus-1.so.3 \
libfontconfig.so.1 \
libfreetype.so.6 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgphoto2-port.so.12 \
libgphoto2.so.6 \
libgssapi-krb5.so.2 \
libgstaudio-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libgstvideo-1.0.so.0 \
libkrb5.so.3 \
libm.so.6 \
libpcap.so.1 \
libpcsclite.so.1 \
libpulse.so.0 \
libsane.so.1 \
libudev.so.1 \
libunwind.so.8 \
libusb-1.0.so.0 \
libv4l2.so.0 \
libvulkan-intel \
libvulkan-radeon \
libvulkan.so.1 \
libwayland-client.so.0 \
samba-winbind"

inherit rpm
