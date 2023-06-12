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

PV = "1.220"

RPM_NAME = "bdf2psf-1.220-1.1.noarch.rpm"
RPM_HASH = "e5b3c572132ec212493a6850be0f15de59243ff645d09078e3f052cacf2601a498b0ec74bff6449b896812c7a8966d71332bd866a0641839a1fe5c7f8616741e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bdf2psf"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
