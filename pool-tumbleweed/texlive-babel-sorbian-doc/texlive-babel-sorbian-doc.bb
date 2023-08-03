SUMMARY = "Documentation for texlive-babel-sorbian"
DESCRIPTION = "This package includes the documentation for texlive-babel-sorbian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0jsvn60975"

RPM_NAME = "texlive-babel-sorbian-doc-2023.209.1.0jsvn60975-54.1.noarch.rpm"
RPM_HASH = "8ec18ed4ce24959b661d2c20e28bf32a877a3407535317e6f33a1e7f92c64e200a49652035d26e8e3250ab0fc50cb4be56927655d34e97ada4e3767364291d82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-sorbian-doc"

RDEPENDS:${PN} += ""

inherit rpm
