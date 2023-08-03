SUMMARY = "Documentation for texlive-xcpdftips"
DESCRIPTION = "This package includes the documentation for texlive-xcpdftips"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn50449"

RPM_NAME = "texlive-xcpdftips-doc-2023.209.1.1svn50449-53.1.noarch.rpm"
RPM_HASH = "e760b291f99fe4a4f0c501d238e8aa8b37319d9c3f95f81c0eabe2a3e35f7c947af8ecfa636508f02ef1a6a5e3018abcf95ddef38c12518b2ef5a345e31ec28e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcpdftips-doc"

RDEPENDS:${PN} += ""

inherit rpm
