SUMMARY = "Documentation for texlive-gridslides"
DESCRIPTION = "This package includes the documentation for texlive-gridslides"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.1svn54512"

RPM_NAME = "texlive-gridslides-doc-2023.201.0.0.1.1svn54512-53.2.noarch.rpm"
RPM_HASH = "c5de3774f6e5cf6f91e8174249779e10b6f2f92cdefb4bdab7c16cdfad941130371b29656b2a444fe87323e5408fa55ad9a10c69001f1b44f579f84e36247e73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gridslides-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
