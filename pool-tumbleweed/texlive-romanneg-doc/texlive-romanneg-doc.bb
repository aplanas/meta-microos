SUMMARY = "Documentation for texlive-romanneg"
DESCRIPTION = "This package includes the documentation for texlive-romanneg"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn20087"

RPM_NAME = "texlive-romanneg-doc-2023.209.svn20087-54.1.noarch.rpm"
RPM_HASH = "bae04409eae795feb4556d85fbd5c88e785fd00c653c4e7777d314be6bdf5209afd7fe2c182a5a2896e9f0a595f5b19a681f834b87fce9028963a627026a722e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-romanneg-doc"

RDEPENDS:${PN} += ""

inherit rpm
