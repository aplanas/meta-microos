SUMMARY = "Documentation for texlive-epsf"
DESCRIPTION = "This package includes the documentation for texlive-epsf"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.7.4svn21461"

RPM_NAME = "texlive-epsf-doc-2023.201.2.7.4svn21461-53.2.noarch.rpm"
RPM_HASH = "49cfffd0214e243920021240cbfc430ac5c1017fc34241562e765b39f084a8fe52399eede524edc52bfb273ff93da9cca030092db61508a878e5183adfa00177"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epsf-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
