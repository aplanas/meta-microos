SUMMARY = "Documentation for texlive-addliga"
DESCRIPTION = "This package includes the documentation for texlive-addliga"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn50912"

RPM_NAME = "texlive-addliga-doc-2023.209.1.0svn50912-55.1.noarch.rpm"
RPM_HASH = "73dd8874daf7ce9cd36c454cf0fb95bf408181a1d230dbc1c6d4b7f161908d4cb6c02b87190424992ff01fd2b53d90dbe410efbc56e81515b1a8f11a17a73815"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-addliga-doc"

RDEPENDS:${PN} += ""

inherit rpm
