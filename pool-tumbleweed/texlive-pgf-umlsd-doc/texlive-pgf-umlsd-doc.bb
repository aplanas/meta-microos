SUMMARY = "Documentation for texlive-pgf-umlsd"
DESCRIPTION = "This package includes the documentation for texlive-pgf-umlsd"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.7svn55342"

RPM_NAME = "texlive-pgf-umlsd-doc-2023.209.0.0.7svn55342-52.1.noarch.rpm"
RPM_HASH = "6036aacb7daed0d67c06b39c5b882ac7aec949ddf51c15d96be1768da0fe3413efd637982c25ab97789a30c2ed700c96e970b4278f6a492d4a3e6dd4a6f92266"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgf-umlsd-doc"

RDEPENDS:${PN} += ""

inherit rpm
