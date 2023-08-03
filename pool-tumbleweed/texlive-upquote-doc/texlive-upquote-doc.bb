SUMMARY = "Documentation for texlive-upquote"
DESCRIPTION = "This package includes the documentation for texlive-upquote"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn26059"

RPM_NAME = "texlive-upquote-doc-2023.209.1.3svn26059-54.1.noarch.rpm"
RPM_HASH = "0683081b139429fb6d6728b4d07658f9c5bdb6e49bf0f54ee54b140149e073aacc39e4de77ba908244544cb5aa99a8eeeeb9dc53c6d7291cdadcc5ce72a88f42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-upquote-doc"

RDEPENDS:${PN} += ""

inherit rpm
