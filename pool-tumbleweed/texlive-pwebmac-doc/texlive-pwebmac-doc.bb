SUMMARY = "Documentation for texlive-pwebmac"
DESCRIPTION = "This package includes the documentation for texlive-pwebmac"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.4.8.1svn63731"

RPM_NAME = "texlive-pwebmac-doc-2023.201.4.8.1svn63731-53.2.noarch.rpm"
RPM_HASH = "3dedd4963b364a477245cfe5a9fae03a6a7faf88bf8f4131375148b4e6ff8b2338ce903109dab8de8271fbc6e27681fc5da61107fa4b1bf7e8934ba4b3e8fc1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pwebmac-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
