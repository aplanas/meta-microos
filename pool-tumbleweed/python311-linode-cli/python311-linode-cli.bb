SUMMARY = "The Linode command-line interface"
DESCRIPTION = "The Linode Command Line interface"
LICENSE = "BSD-3-Clause"

PV = "5.25.0"

RPM_NAME = "python311-linode-cli-5.25.0-1.6.aarch64.rpm"
RPM_HASH = "1e093c5cc2e0e0a258c3be4740a6d72a990ebacf21a7a79e07eb8dbbcef4aa6b298feede13cec0d614679206ebcf1245a72882ae22e529adad34f46638d4cd2f"

RPROVIDES:${PN} += "python3-linode-cli \
python3.11dist-linode-cli \
python311-linode-cli \
python3dist-linode-cli"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-requests \
python311-terminaltables \
update-alternatives"

inherit rpm
