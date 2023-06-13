SUMMARY = "Documentation for texlive-digestif"
DESCRIPTION = "This package includes the documentation for texlive-digestif"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.5.1svn65223"

RPM_NAME = "texlive-digestif-doc-2023.201.0.0.5.1svn65223-52.1.noarch.rpm"
RPM_HASH = "7d86c9703c86cbfd772335d2bd9ed7709b14a44d20f800e60758a709c2561cbd6f485eeb693b25c48e42dc18ba9bf13c793823fe0159e971e154a3fa307fca6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-digestif-doc"

RDEPENDS:${PN} += "/usr/bin/lua"

inherit rpm
