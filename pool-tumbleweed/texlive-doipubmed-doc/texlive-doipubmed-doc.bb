SUMMARY = "Documentation for texlive-doipubmed"
DESCRIPTION = "This package includes the documentation for texlive-doipubmed"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn15878"

RPM_NAME = "texlive-doipubmed-doc-2023.201.1.01svn15878-52.1.noarch.rpm"
RPM_HASH = "a6bab04ddc6d3f88d2c61536004dd5db5e5121ca7a85094a1fc2b337999c7c4f89bceb39502dc069fd1b0222af3dd54ee895b890112cab1b64b29bb2979a2867"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-doipubmed-doc"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
