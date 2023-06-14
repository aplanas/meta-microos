SUMMARY = "SIL Yi Font"
DESCRIPTION = "The Nuosu SIL Font is a single Unicode font for the standardized \
Yi script used by a large ethnic group in southwestern China."
LICENSE = "OFL-1.1"

PV = "2.200"

RPM_NAME = "nuosu-fonts-2.200-1.4.noarch.rpm"
RPM_HASH = "712c0dcc100dc6eca9d97dcfcf43e099958e06d96894fa5434f55772ad80c9e04bcf57519a4030d242e2582afa3b9bb9cb88c7828c6e7f67c34fddfc70259a28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nuosu-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
