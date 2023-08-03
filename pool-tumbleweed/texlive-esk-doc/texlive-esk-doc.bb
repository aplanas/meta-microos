SUMMARY = "Documentation for texlive-esk"
DESCRIPTION = "This package includes the documentation for texlive-esk"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn18115"

RPM_NAME = "texlive-esk-doc-2023.209.1.0svn18115-54.1.noarch.rpm"
RPM_HASH = "e3c2b8f10d6bddd5b7742f443fc69b8262e222c2ef898f0ccdcdb8a7c8e0d4cb7f1e9644704320ea38310b7a5f93b9aa45af781a4e44cbabb7b7363d08e78564"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esk-doc"

RDEPENDS:${PN} += ""

inherit rpm
