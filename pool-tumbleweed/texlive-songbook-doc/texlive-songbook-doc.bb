SUMMARY = "Documentation for texlive-songbook"
DESCRIPTION = "This package includes the documentation for texlive-songbook"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.4.5svn18136"

RPM_NAME = "texlive-songbook-doc-2023.209.4.5svn18136-58.1.noarch.rpm"
RPM_HASH = "1221c7c8840ba35b791e3bf3998eb323326ea9b632bef4421ea89cc3ed8f1af08564e7be3adfa8bc324f87fd33e295f3a50506c3f6667fc1a2437165929f6ae8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-songbook-doc"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh"

inherit rpm
