SUMMARY = "Documentation for texlive-pkfix"
DESCRIPTION = "This package includes the documentation for texlive-pkfix"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn26032"

RPM_NAME = "texlive-pkfix-doc-2023.209.1.7svn26032-52.1.noarch.rpm"
RPM_HASH = "59509b25d9cb3a68c91c27e7f4cb623f3f6dbe9a92f186eaa0e350fcfc22bf9fb4ec4a4af5f70f64440d5466a382ae84538c3df22b9370920445fff822bbc4ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pkfix-doc"

RDEPENDS:${PN} += ""

inherit rpm
