SUMMARY = "Info files for GNU Emacs"
DESCRIPTION = "This package contains all the Info files for GNU Emacs. These files can \
be read online with GNU Emacs. They describe Emacs and some of its \
modes."
LICENSE = "GPL-3.0-or-later"

PV = "28.2"

RPM_NAME = "emacs-info-28.2-4.2.noarch.rpm"
RPM_HASH = "8ec0718dd864dc2e3c13c270fa8f6b4cfb8cc08f1648cb3b0f24ae8584395f77bfd79ba059d1d3248feea676292dbf484ac1ca378091550aac762d5c7175a2d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emacs-info"
RDEPENDS:${PN} += ""

inherit rpm
