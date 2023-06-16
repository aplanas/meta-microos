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

RPM_NAME = "libsource-highlight-devel-3.1.9-5.7.aarch64.rpm"
RPM_HASH = "cf12ab88b7b494e3d78e1210284c02e0cf569c629e5bd969f290618d6e05701af433e258ac495cf9d7894a7203aae2918a61d477310a16372f9220364c75e7b6"

RPROVIDES:${PN} += "libsource-highlight-devel \
pkgconfig-source-highlight"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libsource-highlight4"

inherit rpm
