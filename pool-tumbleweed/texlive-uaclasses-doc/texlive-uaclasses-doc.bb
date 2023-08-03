SUMMARY = "Documentation for texlive-uaclasses"
DESCRIPTION = "This package includes the documentation for texlive-uaclasses"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-uaclasses-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "eb96bdb44db7ca6b63572b979247063c1a9d8770bd8f399d157c7f31b22e8134d5241c6212738cca907b7a65001406bb7f4ec910773d3b6d180047ed53db29c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uaclasses-doc"

RDEPENDS:${PN} += ""

inherit rpm
