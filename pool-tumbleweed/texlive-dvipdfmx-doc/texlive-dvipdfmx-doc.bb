SUMMARY = "Documentation for texlive-dvipdfmx"
DESCRIPTION = "This package includes the documentation for texlive-dvipdfmx"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn66203"

RPM_NAME = "texlive-dvipdfmx-doc-2023.201.svn66203-53.2.noarch.rpm"
RPM_HASH = "90e64b49c9621cafb09a5a222b23fd7dcdf367a4ceda88ef7bb40f84b7b4890cb6a6d42467ffc6699e0b9ca1c943354927beacf5063bf1ac3eaffe148c7ce60d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvipdfm.1 \
man-dvipdfmx.1 \
man-dvipdft.1 \
man-ebb.1 \
man-extractbb.1 \
man-xdvipdfmx.1 \
texlive-dvipdfmx-doc"

RDEPENDS:${PN} += ""

inherit rpm
