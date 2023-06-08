SUMMARY = "Generate console fonts from BDF source fonts"
DESCRIPTION = "This package provides a command-line converter that can be used in \
scripts to build console fonts from BDF sources automatically. \
The converter comes with a collection of font encodings that cover \
many of the world's languages. The output font can use a different \
character encoding from the input. When the source font does not \
define a glyph for a particular symbol in the encoding table, that \
glyph position in the console font is not wasted but used for \
another symbol."
LICENSE = "GPL-2.0-or-later & MIT & SUSE-Public-Domain"

PV = "1.215"

RPM_NAME = "bdf2psf-1.215-1.2.noarch.rpm"
RPM_HASH = "304918382cda88efcad74757fe789f6a297ec603afe5abbe5045d90f2d21856d01b0803f6fdf813608a0f768b669526ee8f4992e771fa09c996fbe1061057dac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bdf2psf"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
