SUMMARY = "CD-ROM access library"
DESCRIPTION = "The libcdio package contains libraries for CD-ROM and CD image \
access. Applications can use them as an abstraction to OS- and \
device-dependent properties of a CD-ROM or of the specific details of \
various CD image formats. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of the cdio libraries."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "libcdio-devel-2.1.0-7.1.aarch64.rpm"
RPM_HASH = "9f1d56376d94f7131e6ed04fdf3c7b235947dd45d67406221ebc2a6c474ee6dc976b74282a7cca928fef4d4bc7b1981f894d5dcdecfb97e59e7eaedae4129d99"

RPROVIDES:${PN} += "libcdio-devel \
libcdio-devel(aarch-64) \
pkgconfig(libcdio) \
pkgconfig(libcdio++) \
pkgconfig(libiso9660) \
pkgconfig(libiso9660++) \
pkgconfig(libudf)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libcdio++1 \
libcdio19 \
libiso9660++0 \
libiso9660-11 \
libudf0 \
pkgconfig(libcdio)"

inherit rpm
