SUMMARY = "Documentation for texlive-resolsysteme"
DESCRIPTION = "This package includes the documentation for texlive-resolsysteme"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.5svn66192"

RPM_NAME = "texlive-resolsysteme-doc-2023.209.0.0.1.5svn66192-54.2.noarch.rpm"
RPM_HASH = "008b0c787a740ef11555248d43ad88f0a0769c7d02f4bf316ce65834a64e6a6492104b6b68971afde2c3f3255edeb3dac39deb285adc0cd3cb2a1f63022f4362"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-resolsysteme-doc-fr \
texlive-resolsysteme-doc"

RDEPENDS:${PN} += ""

inherit rpm
