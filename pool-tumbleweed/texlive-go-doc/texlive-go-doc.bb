SUMMARY = "Documentation for texlive-go"
DESCRIPTION = "This package includes the documentation for texlive-go"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn28628"

RPM_NAME = "texlive-go-doc-2023.201.svn28628-53.2.noarch.rpm"
RPM_HASH = "7675295af2a95f01a0f152bc90a256c1f5d05b524815fa6fc1fd90ca7d0bcb0374f57127b71bece10e636da9c63ba06ff00e1776988e126ba514d7224c7b1684"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-go-doc"

RDEPENDS:${PN} += ""

inherit rpm
