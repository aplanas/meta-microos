SUMMARY = "Documentation for texlive-latexpand"
DESCRIPTION = "This package includes the documentation for texlive-latexpand"
LICENSE = "BSD-3-Clause"

PV = "2023.209.1.7.2svn66226"

RPM_NAME = "texlive-latexpand-doc-2023.209.1.7.2svn66226-55.1.noarch.rpm"
RPM_HASH = "20514359d07a3c4a7e6b7d23e7df7ca63f9746816a9c7b6dce710d73a922097023d06b997db49f3708ec5f91dfad72a9d43fb16fc7ba03924eb069fd4273763d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexpand-doc"

RDEPENDS:${PN} += ""

inherit rpm
