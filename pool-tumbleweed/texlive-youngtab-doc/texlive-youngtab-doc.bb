SUMMARY = "Documentation for texlive-youngtab"
DESCRIPTION = "This package includes the documentation for texlive-youngtab"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn56500"

RPM_NAME = "texlive-youngtab-doc-2023.201.1.1svn56500-52.2.noarch.rpm"
RPM_HASH = "97891e241633a57b924d54e38d6a07476bfebf2b51484c154ba86766bfc085887d41b778e8e2863da4abf26a611172d5b2d33b0729c77a0773c2233aaa2c3c42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-youngtab-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
