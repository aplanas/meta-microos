SUMMARY = "Smooth-edge version of Fixedsys Excelsior"
DESCRIPTION = "Smooth-edge versions of the Fixedsys Excelsior font."
LICENSE = "SUSE-Public-Domain"

PV = "3.02.9"

RPM_NAME = "consoleet-fixedsys-fonts-3.02.9-1.2.noarch.rpm"
RPM_HASH = "d3317fd54b96da8d0ef10a857f082d13c162741f501ae4d0a23c15f1b75640e7a471bdd0513cc07bbe14cd6ffc39a4f7e7a0ccf62149f239e064bd246f26b270"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "consoleet-fixedsys-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
