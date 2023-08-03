SUMMARY = "Documentation for texlive-cd"
DESCRIPTION = "This package includes the documentation for texlive-cd"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.4svn34452"

RPM_NAME = "texlive-cd-doc-2023.209.1.4svn34452-53.1.noarch.rpm"
RPM_HASH = "593b72d3482b62bbd1ff753757668a25d8ad75089f0722dd1c6d7743f9092dc12b1cfaaf82028993c401886ce9ba384025ba868b6214c52b4a25b858587e16f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cd-doc"

RDEPENDS:${PN} += "/usr/bin/ruby"

inherit rpm
