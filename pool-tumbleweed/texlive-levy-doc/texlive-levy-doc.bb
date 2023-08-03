SUMMARY = "Documentation for texlive-levy"
DESCRIPTION = "This package includes the documentation for texlive-levy"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn21750"

RPM_NAME = "texlive-levy-doc-2023.209.svn21750-55.1.noarch.rpm"
RPM_HASH = "e6ca81e77864750bd58971376aabbad8a2fef2ec9ac738b4a050dcf9ef00d186967bf97d0372465b7c0e435751c8b707cd91b1c4df9d2fae8226f36fc913a832"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-levy-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
