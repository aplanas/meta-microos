SUMMARY = "Documentation for texlive-rec-thy"
DESCRIPTION = "This package includes the documentation for texlive-rec-thy"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.3.8.2svn63982"

RPM_NAME = "texlive-rec-thy-doc-2023.209.3.8.2svn63982-54.1.noarch.rpm"
RPM_HASH = "7e2644cb01468c8d1b758f4b7d0d23e5839223b5afc7750cdceb9e23e736a98e99cea85c8c97e8def2b376545bceb23d992bb66196f6c476b6a446add4d2e84d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rec-thy-doc"

RDEPENDS:${PN} += ""

inherit rpm
