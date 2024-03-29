SUMMARY = "Generate HTML web page from help texts"
DESCRIPTION = "This package provides functions for generating HTML pages that contain \
the help texts for a set of functions. The package is designed to be \
as general as possible, but also contains convenience functions for \
generating a set of pages for entire packages. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.3"

RPM_NAME = "octave-forge-generate_html-0.3.3-1.6.noarch.rpm"
RPM_HASH = "9bdc8fd217f427d4110304abe19d17f472af10938f059e2a43ccb3acdf01fddb78cdf6609e9e8d7eaeb77a81f05506d47fc30b32d1cf2624495927276c84972b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-generate-html"

RDEPENDS:${PN} += "/usr/bin/sh \
makeinfo \
octave-cli"

inherit rpm
