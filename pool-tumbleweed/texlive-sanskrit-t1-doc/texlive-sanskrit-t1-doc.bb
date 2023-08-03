SUMMARY = "Documentation for texlive-sanskrit-t1"
DESCRIPTION = "This package includes the documentation for texlive-sanskrit-t1"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn55475"

RPM_NAME = "texlive-sanskrit-t1-doc-2023.209.svn55475-54.1.noarch.rpm"
RPM_HASH = "8f0a7ae17dbb52955e367083e913f3bc10dc856265e741ce0ecf5d5f6f87233653cbf2d83dc95af9934d022669cf45f694e540095c33de91e0ec8fae73b768d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sanskrit-t1-doc"

RDEPENDS:${PN} += ""

inherit rpm
