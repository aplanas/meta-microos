SUMMARY = "Documentation for python-Flask"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-Flask."
LICENSE = "BSD-3-Clause"

PV = "2.2.5"

RPM_NAME = "python311-Flask-doc-2.2.5-1.3.noarch.rpm"
RPM_HASH = "dd49ce03baf1b530a0f58221583781dea07bfc037c3b75ac4e1fc8026aed8f2e1a6a9d5beaaec70899382b01bc0962396aa9177daf302e3129e3758ee9bb6434"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-doc \
python311-Flask-doc"

RDEPENDS:${PN} += "python311-Flask"

inherit rpm
