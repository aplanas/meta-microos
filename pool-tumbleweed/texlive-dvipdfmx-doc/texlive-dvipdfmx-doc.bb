SUMMARY = "Documentation for texlive-dvipdfmx"
DESCRIPTION = "This package includes the documentation for texlive-dvipdfmx"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn66203"

RPM_NAME = "texlive-dvipdfmx-doc-2023.209.svn66203-54.2.noarch.rpm"
RPM_HASH = "c6ba3fd061e826e7c926dae774d8ab84b6993f95471c4e787c743ef0ab672b49ee7931df9b040e55a55940c01ff02e280b539b48222992198e818b56b4c12323"
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
