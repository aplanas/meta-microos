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

RPM_NAME = "perl-PostScript-Simple-0.09-1.27.noarch.rpm"
RPM_HASH = "3f9367a44d12aa3a3dcea87c7054ae5fa5db64b03345c90e96ab69d80694f5f4dccda207ada888711c89b87a3bee3109a6a756a8345e7f1803126163dbc38f0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PostScript--Simple \
perl-PostScript--Simple--EPS \
perl-PostScript-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
