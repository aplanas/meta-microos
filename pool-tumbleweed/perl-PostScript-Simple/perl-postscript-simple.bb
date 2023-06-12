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

RPM_NAME = "perl-PostScript-Simple-0.09-1.26.noarch.rpm"
RPM_HASH = "a935ef0e6fc1b30affe763e34af69dc5b787f9b40b85975243c905196adfc1b7e057ac2ce43f27ff5c415b471692a065cbd495272d9968b509393a625a23b36a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(PostScript::Simple) \
perl(PostScript::Simple::EPS) \
perl-PostScript-Simple"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
