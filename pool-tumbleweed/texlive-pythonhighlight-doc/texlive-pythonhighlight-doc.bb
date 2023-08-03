SUMMARY = "Documentation for texlive-pythonhighlight"
DESCRIPTION = "This package includes the documentation for texlive-pythonhighlight"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn43191"

RPM_NAME = "texlive-pythonhighlight-doc-2023.209.svn43191-54.1.noarch.rpm"
RPM_HASH = "b76da3af5669d61e786bee50a4b9f473d1ac103ef47eafd90355b0a985804b0e3490dd7082dafd6e3a534eda51f1f482e9c7c75da12c5bf4148fb59787ab84e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pythonhighlight-doc"

RDEPENDS:${PN} += ""

inherit rpm
