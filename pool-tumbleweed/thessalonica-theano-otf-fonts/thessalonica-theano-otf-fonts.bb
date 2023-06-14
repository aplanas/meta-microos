SUMMARY = "Theano Classical Fonts (OpenType Format)"
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
This package contains fonts in OpenType format."
LICENSE = "OFL-1.1"

PV = "2.0"

RPM_NAME = "thessalonica-theano-otf-fonts-2.0-11.18.noarch.rpm"
RPM_HASH = "1c27acbac00511d1811e92d003a3fbc7c81a10b7ece5c9333978d942406dad99c7a667bf35a042ba6e48392ee82ba441097f3dc066cd5b04fd8cac3faa8945bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-el;ru \
theano-fonts-otf \
thessalonica-theano-otf-fonts"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
