SUMMARY = "Documentation for texlive-tapir"
DESCRIPTION = "This package includes the documentation for texlive-tapir"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.2svn20484"

RPM_NAME = "texlive-tapir-doc-2023.209.0.0.2svn20484-55.1.noarch.rpm"
RPM_HASH = "e62adb54910aee77a1f34ca65d4cdd7fdfa70e926e9a9a044e33d75290cb2f384cca15fedf0af380cac0fe281011df7a5ddc20ddd7bb74eb9e3a660bd52ac14a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tapir-doc"

RDEPENDS:${PN} += ""

inherit rpm
