SUMMARY = "Perl extension for generating Scalable Vector Graphics (SVG) documents"
DESCRIPTION = "SVG is a 100% Perl module which generates a nested data structure \
containing the DOM representation of an SVG (Scalable Vector Graphics) \
image. Using SVG, you can generate SVG objects, embed other SVG instances \
into it, access the DOM object, create and access javascript, and generate \
SMIL animation content."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.87"

RPM_NAME = "perl-SVG-2.87-1.6.noarch.rpm"
RPM_HASH = "7a09a6a4d406f7b638bedc24eca97a388033746cc534dc5b16216e42cae47caba76253bdf0a0b52e38e1202b7a48f3927a24e69f967e74bb53000e9e7a9492de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SVG \
perl-SVG--DOM \
perl-SVG--Element \
perl-SVG--Extension \
perl-SVG--XML"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-parent"

inherit rpm
