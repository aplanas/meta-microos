SUMMARY = "Documentation for texlive-formlett"
DESCRIPTION = "This package includes the documentation for texlive-formlett"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.3svn21480"

RPM_NAME = "texlive-formlett-doc-2023.201.2.3svn21480-52.1.noarch.rpm"
RPM_HASH = "fbb258c8b9e60f687fa5b3d08f115cb7829f88c6e9a791d030816caed348af3f4ea6cd4e59bc3c35472a993fe935b25e88b4f8f76775019a37037aade4f6f508"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-formlett-doc"
RDEPENDS:${PN} += ""

inherit rpm
