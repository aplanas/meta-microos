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

RPROVIDES:${PN} += "application() \
application(wine-browsedrive.desktop) \
application(wine-msi.desktop) \
application(wine-notepad.desktop) \
application(wine-regedit.desktop) \
application(wine-uninstaller.desktop) \
application(wine-winecfg.desktop) \
application(wine-winefile.desktop) \
application(wine-winehelp.desktop) \
application(wine-winemine.desktop) \
application(wine.desktop) \
config(wine-staging) \
libwine.so.1()(64bit) \
libwine.so.1(WINE_1.0)(64bit) \
mimehandler(application/x-ms-dos-executable) \
mimehandler(application/x-ms-shortcut) \
mimehandler(application/x-msdos-program) \
mimehandler(application/x-msi) \
mimehandler(application/x-win-lnk) \
wine \
wine-mp3 \
wine-staging \
wine-staging(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libFAudio.so.0()(64bit) \
libGL.so.1()(64bit) \
libOSMesa.so.8()(64bit) \
libOpenCL.so.1()(64bit) \
libOpenCL.so.1(OPENCL_1.0)(64bit) \
libOpenCL.so.1(OPENCL_1.1)(64bit) \
libOpenCL.so.1(OPENCL_1.2)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libX11.so.6()(64bit) \
libXcomposite.so.1()(64bit) \
libXcursor.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXi.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libXrender.so.1()(64bit) \
libXxf86vm.so.1()(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcups.so.2()(64bit) \
libdbus-1.so.3()(64bit) \
libdl.so.2()(64bit) \
libdl.so.2(GLIBC_2.17)(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgcrypt.so.20()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnutls.so.30()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgphoto2.so.6()(64bit) \
libgphoto2_port.so.12()(64bit) \
libgphoto2_port.so.12(LIBGPHOTO2_5_0)(64bit) \
libgsm.so.1()(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgstaudio-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libkrb5.so.3()(64bit) \
liblber-2.4.so.2()(64bit) \
liblcms2.so.2()(64bit) \
libldap_r-2.4.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmpg123.so.0()(64bit) \
libopenal.so.1()(64bit) \
libpcap.so.1()(64bit) \
libpng16.so.16()(64bit) \
libpthread.so.0()(64bit) \
libpthread.so.0(GLIBC_2.17)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libresolv.so.2()(64bit) \
libresolv.so.2(GLIBC_2.17)(64bit) \
librt.so.1()(64bit) \
librt.so.1(GLIBC_2.17)(64bit) \
libsane.so.1()(64bit) \
libtiff.so.5()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libunwind.so.8()(64bit) \
libusb-1.0.so.0()(64bit) \
libv4l2.so.0()(64bit) \
libvkd3d-shader.so.1()(64bit) \
libvkd3d.so.1()(64bit) \
libvkd3d.so.1(VKD3D_1_0)(64bit) \
libvulkan.so.1()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.7)(64bit) \
libxml2.so.2(LIBXML2_2.5.8)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.14)(64bit) \
libxml2.so.2(LIBXML2_2.6.15)(64bit) \
libxml2.so.2(LIBXML2_2.6.2)(64bit) \
libxml2.so.2(LIBXML2_2.6.21)(64bit) \
libxml2.so.2(LIBXML2_2.6.23)(64bit) \
libxml2.so.2(LIBXML2_2.6.8)(64bit) \
libxml2.so.2(LIBXML2_2.7.3)(64bit) \
libxml2.so.2(LIBXML2_2.9.0)(64bit) \
libxslt.so.1()(64bit) \
samba-winbind"

inherit rpm
