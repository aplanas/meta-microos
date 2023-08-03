SUMMARY = "Documentation for texlive-sa-tikz"
DESCRIPTION = "This package includes the documentation for texlive-sa-tikz"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7asvn32815"

RPM_NAME = "texlive-sa-tikz-doc-2023.209.0.0.7asvn32815-54.1.noarch.rpm"
RPM_HASH = "a5bacd2043e17c038c7580ab0517858e95ed7c92241a681922adb74e4d5a214b294f4a3501d0b7977316c177c2bc9f0f4543d1bde22388137d6d7c2c7c8db5d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sa-tikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
