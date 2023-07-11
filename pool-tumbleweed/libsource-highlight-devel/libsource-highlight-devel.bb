SUMMARY = "Source Code Highlighting C++ Library"
DESCRIPTION = "Source-highlight reads source language specifications dynamically, thus it can \
be easily extended (without recompiling the sources) for handling new \
languages. It also reads output format specifications dynamically, and thus it \
can be easily extended (without recompiling the sources) for handling new \
output formats. The syntax for these specifications is quite easy (take a look \
at the manual). \
 \
libsource-highlight is a C++ library that provides the features of \
Source-highlight."
LICENSE = "GPL-3.0-only"

PV = "3.1.9"

RPM_NAME = "libsource-highlight-devel-3.1.9-5.8.aarch64.rpm"
RPM_HASH = "a1fbdb8757e84806b0ff3ba263085f9d0f0417ca4a2f3d2590246a7b8d7e6306f61de6d5e015b9b9a16c3f1b5ab89d0d149eb53b1f2995f35a54673860990e84"

RPROVIDES:${PN} += "libsource-highlight-devel \
pkgconfig-source-highlight"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libsource-highlight4"

inherit rpm
