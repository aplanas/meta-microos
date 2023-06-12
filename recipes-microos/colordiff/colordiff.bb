SUMMARY = "Colour-highlighted 'diff' output"
DESCRIPTION = "The Perl script colordiff is a wrapper for 'diff' and produces the same \
output but with pretty 'syntax' highlighting. Colour schemes can be \
customized."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.21"

RPM_NAME = "colordiff-1.0.21-1.2.noarch.rpm"
RPM_HASH = "51caef57d096c5ed41cd545693e03a23a41ebb0081e07243445341940b38548da5f8ff40a29f58d5ee8fab3dbde60c56e1cbf11eab40127c128f0b46f2076e3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "colordiff \
config(colordiff)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl"

inherit rpm
