SUMMARY = "Documentation for texlive-wordcount"
DESCRIPTION = "This package includes the documentation for texlive-wordcount"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn46165"

RPM_NAME = "texlive-wordcount-doc-2023.209.1.7svn46165-54.1.noarch.rpm"
RPM_HASH = "cc2fb5e8b28fabbcc92fcd39c1ddb801fe33271b8056d3d65a272cde49e18ef7df40404419ee7e30ef3022d1868a4ec2638a0a100e206b3f21c5573ed990977d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wordcount-doc"

RDEPENDS:${PN} += ""

inherit rpm
