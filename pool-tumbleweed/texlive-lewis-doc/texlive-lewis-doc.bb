SUMMARY = "Documentation for texlive-lewis"
DESCRIPTION = "This package includes the documentation for texlive-lewis"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.1svn15878"

RPM_NAME = "texlive-lewis-doc-2023.201.0.0.1svn15878-54.1.noarch.rpm"
RPM_HASH = "6123918060891a8e27a3312fa6e92049a4f15afd28db0bba632030b5499ecaf79b46c3c66b755a8af2ee982f22f0ccee668daac9f23b578c7731f89393ff12c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lewis-doc"

RDEPENDS:${PN} += ""

inherit rpm
