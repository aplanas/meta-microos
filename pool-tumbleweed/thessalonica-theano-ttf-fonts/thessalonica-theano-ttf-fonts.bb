SUMMARY = "Theano Classical Fonts (TrueType Format)"
DESCRIPTION = "Theano Classical Fonts include three fonts listed below. Each font is \
currently available just in one weight/shape (regular) and contains \
Latin, Greek and Cyrillic letters. \
 \
Theano Didot. \
A classicist face, with both its Roman and Greek parts implemented in \
Didot style. Unlike Old Standard, this font is designed from French \
sources. \
 \
Theano Modern. \
A font with Greek letters designed in the Porsonic style. Unlike most \
modern implementation, it is based on Figgins Pica No. 3 / Small Pica \
No. 2 — probably the most successful and once the most popular Greek \
face of a Porsonic origin — rather than on later Monotype's design. \
The accompanying Latin font is implemented in the Modern style and \
modelled after English Modern faces of later 19th century, often used \
alonglide with Porsonic Greek types. \
 \
Theano Old Style. \
A modernized 'Old Style' Greek font with a large number of historic \
ligatures and alternate forms, modelled after some early 19th century \
types designed by Figgins' type foundry. It is accompanied by a Latin \
face based on some 'Old Style' Roman fonts of the late 19th and early \
20th century. \
 \
This package contains fonts in TrueType format."
LICENSE = "OFL-1.1"

PV = "2.0"

RPM_NAME = "thessalonica-theano-ttf-fonts-2.0-11.18.noarch.rpm"
RPM_HASH = "025b16c2955a934f3c6392dde7c297a363fd36e70ff2057e93d6c690915ab40c445c9db0d47d9a27ecf5c29b738b0ef46dd94f789963c7b0ac2af2a30e62c54e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "theano-fonts-ttf \
thessalonica-theano-ttf-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
