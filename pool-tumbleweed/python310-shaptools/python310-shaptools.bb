SUMMARY = "Python tools to interact with SAP HANA utilities"
DESCRIPTION = "API to expose SAP HANA functionalities"
LICENSE = "Apache-2.0"

PV = "0.3.13+git.1673855974.f208fad"

RPM_NAME = "python310-shaptools-0.3.13+git.1673855974.f208fad-1.4.noarch.rpm"
RPM_HASH = "a3d1696d7a70573ce20789807298b86bf82a3ebf95087d1676dad6526cabfe0797e112c866c62996f0d5fea4a4d1d80a023aff8e084320beb34a8a4c997d9281"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-shaptools \
python3.10dist(shaptools) \
python310-shaptools \
python3dist(shaptools)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
