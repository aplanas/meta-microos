SUMMARY = "A complete, SMuFL compliant music font"
DESCRIPTION = "Bravura is the reference music font for the Standard Music Font Layout \
(SMuFL) specification, fully compliant with SMuFL 1.2."
LICENSE = "OFL-1.1"

PV = "1.392"

RPM_NAME = "steinberg-bravura-fonts-1.392-1.6.noarch.rpm"
RPM_HASH = "058d32a9a99614021325a36a0a4183bd13e79f0eddca798caeceaafbfeff727b229c972bfadfd8e9a23b6aba848b3f79ae5cd26db0ee9e8d6f4128bc97413292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "steinberg-bravura-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
