SUMMARY = "Documentation for texlive-hrefhide"
DESCRIPTION = "This package includes the documentation for texlive-hrefhide"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn66189"

RPM_NAME = "texlive-hrefhide-doc-2023.209.1.1asvn66189-54.1.noarch.rpm"
RPM_HASH = "7bbaa8cca4159118fa145615bf20067a1966b99b4bad52f75d5aca1ce499a63fb216bb9362422e8b56b5a6441f62353cc995510dac1a8db713eef5f495aa85dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hrefhide-doc"

RDEPENDS:${PN} += ""

inherit rpm
