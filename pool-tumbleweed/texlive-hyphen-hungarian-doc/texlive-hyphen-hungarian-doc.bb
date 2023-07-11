SUMMARY = "Documentation for texlive-hyphen-hungarian"
DESCRIPTION = "This package includes the documentation for texlive-hyphen-hungarian"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-hungarian-doc-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "963f1e77365b26ad7c2f7f43bb2ac3350661332cf67cc769b0dffe48c882fa0ea5a2c8b9c0d850573c1ca8a3b849a6df7d6febdd1d3f14937e90afc2c728ca04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyphen-hungarian-doc"

RDEPENDS:${PN} += "/usr/bin/ruby"

inherit rpm
