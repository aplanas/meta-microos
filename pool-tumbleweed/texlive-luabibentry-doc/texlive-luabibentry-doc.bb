SUMMARY = "Documentation for texlive-luabibentry"
DESCRIPTION = "This package includes the documentation for texlive-luabibentry"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1asvn55777"

RPM_NAME = "texlive-luabibentry-doc-2023.201.0.0.1asvn55777-52.1.noarch.rpm"
RPM_HASH = "3a1ab51be67865dbf055d7931ce55a0c5321fbe10831004277986f9ecc4d38bd0df2633c5da2d6a5130894774e1da8ec3be7315d6aa65f0948032154c51283d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luabibentry-doc"
RDEPENDS:${PN} += ""

inherit rpm
