SUMMARY = "Documentation for texlive-ekdosis"
DESCRIPTION = "This package includes the documentation for texlive-ekdosis"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.4svn61113"

RPM_NAME = "texlive-ekdosis-doc-2023.209.1.4svn61113-54.1.noarch.rpm"
RPM_HASH = "249cd1639a3c58651a8e56153a4831d393127f0af6a15f97440c2d7cfa97541888b7fb73d70272f1d0b82dd8fa1bee0d340d641f332216c0c15c0805872065b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ekdosis-doc"

RDEPENDS:${PN} += ""

inherit rpm
