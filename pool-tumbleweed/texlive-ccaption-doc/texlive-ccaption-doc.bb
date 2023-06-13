SUMMARY = "Documentation for texlive-ccaption"
DESCRIPTION = "This package includes the documentation for texlive-ccaption"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2csvn23443"

RPM_NAME = "texlive-ccaption-doc-2023.201.3.2csvn23443-52.1.noarch.rpm"
RPM_HASH = "4f393300274dd2c39d73251f1f07f69dcd8d4115d7355fd45e16ff435bc8083cd308ede55c0d8901d390fe124e2fa6cdbe962ab38ac17af66f5320382ed14b8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ccaption-doc"

RDEPENDS:${PN} += ""

inherit rpm
