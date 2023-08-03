SUMMARY = "Documentation for texlive-newlfm"
DESCRIPTION = "This package includes the documentation for texlive-newlfm"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.9.4svn15878"

RPM_NAME = "texlive-newlfm-doc-2023.209.9.4svn15878-55.1.noarch.rpm"
RPM_HASH = "5d09859d634724fb1c9e13219701603a50dbad5a5d5cfedf15e5826b0268b5f1620a6cdb23bcb46ebf4fe205f76beebb06948e5c6afdd7c1edfd260b79a73699"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newlfm-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
