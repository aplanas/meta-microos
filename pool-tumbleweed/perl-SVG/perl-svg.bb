SUMMARY = "Perl extension for generating Scalable Vector Graphics (SVG) documents"
DESCRIPTION = "SVG is a 100% Perl module which generates a nested data structure \
containing the DOM representation of an SVG (Scalable Vector Graphics) \
image. Using SVG, you can generate SVG objects, embed other SVG instances \
into it, access the DOM object, create and access javascript, and generate \
SMIL animation content."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.87"

RPM_NAME = "perl-SVG-2.87-1.5.noarch.rpm"
RPM_HASH = "472372c10b74a54e43adafb73282f7bb943d62743c6c1645f28ba135cc6a2e67a885a3a7ad22624334c49c0d38a18fb38ebc0c647eb9594139d63034f22ed556"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SVG \
perl-SVG--DOM \
perl-SVG--Element \
perl-SVG--Extension \
perl-SVG--XML"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-parent"

inherit rpm
