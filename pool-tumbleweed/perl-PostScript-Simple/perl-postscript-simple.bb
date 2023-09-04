SUMMARY = "Produce PostScript files from Perl"
DESCRIPTION = "PostScript::Simple allows you to have a simple method of writing PostScript \
files from Perl. It has graphics primitives that allow lines, curves, \
circles, polygons and boxes to be drawn. Text can be added to the page \
using standard PostScript fonts. \
 \
The images can be single page EPS files, or multipage PostScript files. The \
image size can be set by using a recognised paper size (''A4'', for \
example) or by giving dimensions. The units used can be specified (''mm'' \
or ''in'', etc) and are the same as those used in TeX. The default unit is \
a bp, or a PostScript point, unlike TeX."
LICENSE = "GPL-2.0+"

PV = "0.09"

RPM_NAME = "perl-PostScript-Simple-0.09-1.28.noarch.rpm"
RPM_HASH = "c59fca17962bb4dbc5dc984ca45f1a943c7886f32192eb588725dd327a854ec33aa2cdc7d4b15356d1839f2cfdb132f61d28f1037170df0c7a530ef1cd3c64f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PostScript--Simple \
perl-PostScript--Simple--EPS \
perl-PostScript-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
