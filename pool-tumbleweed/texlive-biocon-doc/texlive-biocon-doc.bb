SUMMARY = "Documentation for texlive-biocon"
DESCRIPTION = "This package includes the documentation for texlive-biocon"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-biocon-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "22df9ff66a5f5560f72b30eed95f7ad1fd872cf0208161986d2d3b84ad59d46e1b0ade0f814084729941c7e89d66ec75d3e786fdef97fd61703ef15e09625be5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biocon-doc"

RDEPENDS:${PN} += ""

inherit rpm
