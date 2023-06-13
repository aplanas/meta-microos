SUMMARY = "Documentation for texlive-duerer"
DESCRIPTION = "This package includes the documentation for texlive-duerer"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn20741"

RPM_NAME = "texlive-duerer-doc-2023.201.svn20741-52.1.noarch.rpm"
RPM_HASH = "99998395cf3942853bd5c965fcfe01de23859f6682d231707d9b157d31c8f3229d6cbdcae35a6a33ce5443ef2262ac2b6879122774d0a98eda31fc29b0f364ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-duerer-doc"

RDEPENDS:${PN} += ""

inherit rpm
