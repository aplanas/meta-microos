SUMMARY = "Documentation for texlive-pl"
DESCRIPTION = "This package includes the documentation for texlive-pl"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.09asvn58661"

RPM_NAME = "texlive-pl-doc-2023.201.1.09asvn58661-51.1.noarch.rpm"
RPM_HASH = "47ec89f8a7d482973f789adc4b7cee2ce66af38b4307957f1eb0371d29991bfed6be7e410f4ad7d6712e22dc2e0a195f436bbe787b2d4d72e7103c61770d303b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pl-doc"
RDEPENDS:${PN} += ""

inherit rpm
