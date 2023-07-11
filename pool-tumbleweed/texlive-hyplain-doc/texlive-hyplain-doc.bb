SUMMARY = "Documentation for texlive-hyplain"
DESCRIPTION = "This package includes the documentation for texlive-hyplain"
LICENSE = "SUSE-Public-Domain"

PV = "2023.208.1.0svn15878"

RPM_NAME = "texlive-hyplain-doc-2023.208.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "814fc646bb320264803dc34c56ecb7b5cf796fb03fafa89bb76d3f12b8431c963c34ad460dee5afad03d4b6d7384faf86260b50f06a564d67f70326fcbf57207"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyplain-doc"

RDEPENDS:${PN} += ""

inherit rpm
