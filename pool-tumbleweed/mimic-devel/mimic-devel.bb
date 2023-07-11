SUMMARY = "Development files for mimic (Mycroft's TTS engine)"
DESCRIPTION = "Mimic is a text-to-speech engine based on Carnegie Mellon \
University’s Flite (Festival-Lite) software. Mimic takes in text and \
reads it out loud to create a voice. \
 \
This package contains the headers and development libraries for mimic."
LICENSE = "BSD-3-Clause & MIT-CMU"

PV = "1.3.0.1"

RPM_NAME = "mimic-devel-1.3.0.1-2.4.aarch64.rpm"
RPM_HASH = "9c4d3105c69b99613aa21efd1ba3dbebaf1fb4c90ebc1be451f960453500b6718cb9d75c4af4e0b1662e23947b9ba4aea95056c6c3ac7dc6d5d8023043047b35"

RPROVIDES:${PN} += "mimic-devel \
pkgconfig-mimic"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
mimic \
pkgconfig-alsa \
pkgconfig-libpcre2-8"

inherit rpm
