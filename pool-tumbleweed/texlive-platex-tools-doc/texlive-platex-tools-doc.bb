SUMMARY = "Documentation for texlive-platex-tools"
DESCRIPTION = "This package includes the documentation for texlive-platex-tools"
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn66185"

RPM_NAME = "texlive-platex-tools-doc-2023.209.svn66185-53.1.noarch.rpm"
RPM_HASH = "751401eddcfa1605708828e6e3962c23803935a176fa42d01d111f64292dbf282ae5237f336f84c7ac9511966ab300e72003108802432ce7471a44687b72e6bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-platex-tools-doc-ja \
texlive-platex-tools-doc"

RDEPENDS:${PN} += ""

inherit rpm
