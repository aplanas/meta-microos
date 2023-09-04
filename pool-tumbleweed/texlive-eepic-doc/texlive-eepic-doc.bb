SUMMARY = "Documentation for texlive-eepic"
DESCRIPTION = "This package includes the documentation for texlive-eepic"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.1esvn15878"

RPM_NAME = "texlive-eepic-doc-2023.209.1.1esvn15878-54.2.noarch.rpm"
RPM_HASH = "8778ebb91ff1998060f0c740fd04148b4e214e41903e750763fee38618df66aba509412128d70e13cc1f3e846d68bf20980b9510b3548492e69f25945980ce98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eepic-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
