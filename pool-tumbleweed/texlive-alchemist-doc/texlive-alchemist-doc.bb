SUMMARY = "Documentation for texlive-alchemist"
DESCRIPTION = "This package includes the documentation for texlive-alchemist"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.00svn66548"

RPM_NAME = "texlive-alchemist-doc-2023.209.1.00svn66548-55.1.noarch.rpm"
RPM_HASH = "27c6d81a609d572f78adcc448184e2c0887d09065a499846beb0a7da712335a2982f373211b004a2f469a981aa706dda77c8b43569d440f2fb7df9fffef15518"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alchemist-doc"

RDEPENDS:${PN} += ""

inherit rpm
