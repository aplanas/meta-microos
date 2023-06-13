SUMMARY = "Documentation for texlive-plstmary"
DESCRIPTION = "This package includes the documentation for texlive-plstmary"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.5csvn31088"

RPM_NAME = "texlive-plstmary-doc-2023.201.0.0.5csvn31088-52.1.noarch.rpm"
RPM_HASH = "fa7b4a35d482bf3c043190608e71126d7747ac81db6a12835f049a34dfe915d0e4e989dff4e418f0f15e322eec4bdbd7341b175fde0e38d4aa0b7f784a0b6747"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plstmary-doc"

RDEPENDS:${PN} += ""

inherit rpm
