SUMMARY = "Documentation for texlive-asyfig"
DESCRIPTION = "This package includes the documentation for texlive-asyfig"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1csvn17512"

RPM_NAME = "texlive-asyfig-doc-2023.209.0.0.1csvn17512-54.1.noarch.rpm"
RPM_HASH = "371d1944e2e8030ef3af405763204fc0c8239a4c3f9dad6764ec2ad48e215e6606fb2936c6c90590930d31d5e374882f9648bed0653d4d343a7cf1f0be7a8a03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asyfig-doc"

RDEPENDS:${PN} += ""

inherit rpm
