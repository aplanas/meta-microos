SUMMARY = "Documentation for texlive-tapir"
DESCRIPTION = "This package includes the documentation for texlive-tapir"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.2svn20484"

RPM_NAME = "texlive-tapir-doc-2023.201.0.0.2svn20484-54.1.noarch.rpm"
RPM_HASH = "a80ed30e9596c4cc4defe9fd6b1273f5c7830d8a6173d01ec5b6bcdab1ea1cf225e9075eebd6abc4c953e8a64ac27138cb5fd1ccb534b22aee37a0865e2e09c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tapir-doc"

RDEPENDS:${PN} += ""

inherit rpm
