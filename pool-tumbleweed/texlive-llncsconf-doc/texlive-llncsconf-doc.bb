SUMMARY = "Documentation for texlive-llncsconf"
DESCRIPTION = "This package includes the documentation for texlive-llncsconf"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.0svn63136"

RPM_NAME = "texlive-llncsconf-doc-2023.201.1.2.0svn63136-54.1.noarch.rpm"
RPM_HASH = "73d2bd56610092fea1334c65205caffa78b26bae0df32c6664b035660b89f42ef26d723d1d51371365db13256e17ccbc95f7c8b3caf8aa80a9e3acb7a9b81259"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-llncsconf-doc"
RDEPENDS:${PN} += ""

inherit rpm
