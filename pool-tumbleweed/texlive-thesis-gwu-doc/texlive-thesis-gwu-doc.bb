SUMMARY = "Documentation for texlive-thesis-gwu"
DESCRIPTION = "This package includes the documentation for texlive-thesis-gwu"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.7.0svn54287"

RPM_NAME = "texlive-thesis-gwu-doc-2023.209.1.7.0svn54287-55.1.noarch.rpm"
RPM_HASH = "74dee6b8086a153e44db144ce443762d38713e23ef78c99de9ae96783e03becbf559e3a05571c4015d7dc4ca310630c184199bba9cc4d453a23030bd765a0aee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thesis-gwu-doc"

RDEPENDS:${PN} += ""

inherit rpm
