SUMMARY = "Documentation for texlive-aiaa"
DESCRIPTION = "This package includes the documentation for texlive-aiaa"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.6svn15878"

RPM_NAME = "texlive-aiaa-doc-2023.209.3.6svn15878-55.1.noarch.rpm"
RPM_HASH = "31862349793ff61a78497313c8332a9fbf034a58ca3240734eaf662406f0d1a6a38d98e415ebc18185db6e7de4b87451eb9a3772b1ab097d441a57b48ca5f88e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aiaa-doc"

RDEPENDS:${PN} += ""

inherit rpm
