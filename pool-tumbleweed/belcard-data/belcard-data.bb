SUMMARY = "Belcard data files"
DESCRIPTION = "Belcard is a C++ library to manipulate the vCard standard format files. \
 \
This package contains data files such as belr grammar."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.16"

RPM_NAME = "belcard-data-5.2.16-1.4.noarch.rpm"
RPM_HASH = "5bbc39289caa34339b76b20488e31a3c4b9021929a63779875b5c1bfc51b97fae87fe9633f52866d7be65e5b6e313bd5e02c36ae7097a43366f4b80c9d140bab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "belcard-data"

RDEPENDS:${PN} += "libbelcard1"

inherit rpm
