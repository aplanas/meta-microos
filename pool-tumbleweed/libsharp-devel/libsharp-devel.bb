SUMMARY = "Headers and devel files for libsharp"
DESCRIPTION = "libsharp is a code library for spherical harmonic transforms (SHTs). \
 \
This package provides the headers and devel files for developing applications \
against libsharp."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "libsharp-devel-1.0.0-1.12.aarch64.rpm"
RPM_HASH = "d6002a7fc66f2ca04721c93867f9f19eb9489d79277e324022dda585fcf706d407dbd8239fd02393869bb6f83b536aac1a64751ec1a82bdd895fc1c70e301802"

RPROVIDES:${PN} += "libsharp-devel \
pkgconfig-libsharp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsharp0"

inherit rpm
