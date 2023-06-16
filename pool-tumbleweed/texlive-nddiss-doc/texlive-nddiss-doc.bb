SUMMARY = "Documentation for texlive-nddiss"
DESCRIPTION = "This package includes the documentation for texlive-nddiss"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2017.2svn45107"

RPM_NAME = "texlive-nddiss-doc-2023.201.3.2017.2svn45107-54.1.noarch.rpm"
RPM_HASH = "560a53237f70f4d0520137636bc591feedc629e6d5ede5a37b20fe0da1c33326e9ed941fb05acd526be33c7c898a85e588110cbbbcb76022e763c299040c821b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nddiss-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
