SUMMARY = "Documentation for texlive-erw-l3"
DESCRIPTION = "This package includes the documentation for texlive-erw-l3"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2svn61799"

RPM_NAME = "texlive-erw-l3-doc-2023.209.4.2svn61799-54.1.noarch.rpm"
RPM_HASH = "2e1d447d90d32e9bfebbf9a579e91dc6b6902246e39b105ea973ba14d332eb97a8f86af1062648763a0355f6930f11c14ace2f701ba745f9df52ae9e648c0d2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-erw-l3-doc"

RDEPENDS:${PN} += ""

inherit rpm
