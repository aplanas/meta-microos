SUMMARY = "Documentation for texlive-simpleinvoice"
DESCRIPTION = "This package includes the documentation for texlive-simpleinvoice"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn45673"

RPM_NAME = "texlive-simpleinvoice-doc-2023.209.svn45673-54.1.noarch.rpm"
RPM_HASH = "91ffb9173384190ab04259c60e7da1fa4ed24d27e19a02b3a153cb44eb485eb374b447e367caa5172bd2ea614a26dde9fa167cdb84af3f9771d0af00dc74a5b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simpleinvoice-doc"

RDEPENDS:${PN} += ""

inherit rpm
