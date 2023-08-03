SUMMARY = "Documentation for texlive-flabels"
DESCRIPTION = "This package includes the documentation for texlive-flabels"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn17272"

RPM_NAME = "texlive-flabels-doc-2023.209.1.0svn17272-53.1.noarch.rpm"
RPM_HASH = "78aee848af3839413e3638bad5a57bd8abfc4703942d4d2f9e07f714dce07ecf817826056f042512c6721f13a8de585eb04cea1c9ad5507ffade85c87808ecf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flabels-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
