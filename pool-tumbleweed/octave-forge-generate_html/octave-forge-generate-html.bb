SUMMARY = "Generate HTML web page from help texts"
DESCRIPTION = "This package provides functions for generating HTML pages that contain \
the help texts for a set of functions. The package is designed to be \
as general as possible, but also contains convenience functions for \
generating a set of pages for entire packages. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.3"

RPM_NAME = "octave-forge-generate_html-0.3.3-1.5.noarch.rpm"
RPM_HASH = "9fa4a30603fade0cc9f1d311242a53824bcaad89daedbcd1d85b35a3e7e32a37cc7a8bf0d3bd0d02ef21b9a838205486e35bbfcaa4292f0b6ce7e6551b1d6c6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-generate-html"

RDEPENDS:${PN} += "/usr/bin/sh \
makeinfo \
octave-cli"

inherit rpm
