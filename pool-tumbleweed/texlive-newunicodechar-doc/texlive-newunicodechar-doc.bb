SUMMARY = "Documentation for texlive-newunicodechar"
DESCRIPTION = "This package includes the documentation for texlive-newunicodechar"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn47382"

RPM_NAME = "texlive-newunicodechar-doc-2023.209.1.2svn47382-55.1.noarch.rpm"
RPM_HASH = "a7fc4bb5eabd05a8fd112a000d9cea962058fc5d4b4490945e364560941ee4108196f78f672abca8c74af18ce8c730728ab0abe454f652beeab6c4c789acea23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newunicodechar-doc"

RDEPENDS:${PN} += ""

inherit rpm
