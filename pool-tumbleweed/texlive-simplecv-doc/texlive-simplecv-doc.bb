SUMMARY = "Documentation for texlive-simplecv"
DESCRIPTION = "This package includes the documentation for texlive-simplecv"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6asvn35537"

RPM_NAME = "texlive-simplecv-doc-2023.209.1.6asvn35537-54.1.noarch.rpm"
RPM_HASH = "fcd7f8afeb0971b9b799b7cdb7b8f6d57da0318b3ece272009a283b6335a18a386cb88ab8dc8e92bf0aadedd057c527c010c793a997eea62069a31babe295ced"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simplecv-doc"

RDEPENDS:${PN} += ""

inherit rpm
