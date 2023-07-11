SUMMARY = "Documentation for texlive-hamnosys"
DESCRIPTION = "This package includes the documentation for texlive-hamnosys"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.3svn61941"

RPM_NAME = "texlive-hamnosys-doc-2023.201.1.0.3svn61941-53.2.noarch.rpm"
RPM_HASH = "52df3e36da553337920e1479ad5f2fc1f67555fa2b3175d1ecb3c40f3a66cb8942ba731446b19fad2b22f987471cb595e3d15fb6ea09990ff906d3d8ba052356"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hamnosys-doc"

RDEPENDS:${PN} += ""

inherit rpm
