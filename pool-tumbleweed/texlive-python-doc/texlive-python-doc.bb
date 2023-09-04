SUMMARY = "Documentation for texlive-python"
DESCRIPTION = "This package includes the documentation for texlive-python"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.22svn60162"

RPM_NAME = "texlive-python-doc-2023.209.0.0.22svn60162-54.2.noarch.rpm"
RPM_HASH = "45cea053d3d8c176979d237b06502e5a527037d77c0fb21aee4bf0f0e3081fc308207c1b2adb43e95d5ccc54fe327d15fc55c0e83a29ff3ae69301ef038c3b55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-python-doc"

RDEPENDS:${PN} += ""

inherit rpm
