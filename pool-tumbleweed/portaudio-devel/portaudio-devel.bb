SUMMARY = "Development package for the portaudio library"
DESCRIPTION = "This package contains the files needed to compile programs that use the \
portaudio library."
LICENSE = "MIT"

PV = "190700_20210406"

RPM_NAME = "portaudio-devel-190700_20210406-1.9.aarch64.rpm"
RPM_HASH = "21b65235c38edf6e6ea0911234619266c9e244a176af339ce7b25815b8a381c2aaa20598c85f97375a6754ad2c550e4d8c8911661628892efbf4bde457ab9a6b"

RPROVIDES:${PN} += "pkgconfig-portaudio-2.0 \
pkgconfig-portaudiocpp \
portaudio-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libportaudio2 \
libportaudiocpp0 \
pkgconfig-alsa \
pkgconfig-portaudio-2.0"

inherit rpm
