SUMMARY = "Documentation for texlive-insbox"
DESCRIPTION = "This package includes the documentation for texlive-insbox"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.2svn34299"

RPM_NAME = "texlive-insbox-doc-2023.209.2.2svn34299-54.1.noarch.rpm"
RPM_HASH = "f7e4a0476f9d9086c06b2a58a2e805d87a23142b176e703303fa8a6b7a538b78f2ae3adac78374b640f07615088df5933931f7f25343677f6c61f34effa4d8ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-insbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
