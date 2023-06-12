SUMMARY = "Documentation for texlive-c-pascal"
DESCRIPTION = "This package includes the documentation for texlive-c-pascal"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.2svn18337"

RPM_NAME = "texlive-c-pascal-doc-2023.201.1.2svn18337-52.1.noarch.rpm"
RPM_HASH = "a205372c83d3ed4354e6a4918545e8960b7c7eaba5642b7532f4630900a150965121fce132f3cdf1b9877e12acb71c6ab0422aa22879a9d6c484f75e56216b9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-c-pascal-doc:en;pl) \
texlive-c-pascal-doc"
RDEPENDS:${PN} += ""

inherit rpm
