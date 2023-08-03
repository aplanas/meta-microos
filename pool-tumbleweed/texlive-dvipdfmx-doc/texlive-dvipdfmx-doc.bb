SUMMARY = "Documentation for texlive-dvipdfmx"
DESCRIPTION = "This package includes the documentation for texlive-dvipdfmx"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn66203"

RPM_NAME = "texlive-dvipdfmx-doc-2023.209.svn66203-54.1.noarch.rpm"
RPM_HASH = "e9b962d248a79fc9b7226cf5a428d5a9b8f9b2d09fee5de7c2e761965f344202e64306ffa95e20cb3db4c99063edaa2bca04d3e49cc4e88030103173dd65f1b5"
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
