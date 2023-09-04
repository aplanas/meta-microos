SUMMARY = "Documentation for texlive-pythonhighlight"
DESCRIPTION = "This package includes the documentation for texlive-pythonhighlight"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn43191"

RPM_NAME = "texlive-pythonhighlight-doc-2023.209.svn43191-54.2.noarch.rpm"
RPM_HASH = "1d49bc5a72536c3eb824d897b39319f1ba89954d5b7f55de1cd6b4565da71d7d01e2396433135df623a1a8d521324eb55161e2585204a4d44513dbbab94f4794"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pythonhighlight-doc"

RDEPENDS:${PN} += ""

inherit rpm
