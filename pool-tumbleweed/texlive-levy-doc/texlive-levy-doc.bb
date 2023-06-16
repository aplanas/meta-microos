SUMMARY = "Documentation for texlive-levy"
DESCRIPTION = "This package includes the documentation for texlive-levy"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn21750"

RPM_NAME = "texlive-levy-doc-2023.201.svn21750-54.1.noarch.rpm"
RPM_HASH = "86635685644c78b68984cfc1cd0a9050977a5619808c0d61d78b6a1ca529092fd0fe0007b15db4417815bdfa1eff7040a60a70c14cc2739605c2d2153f448641"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-levy-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
