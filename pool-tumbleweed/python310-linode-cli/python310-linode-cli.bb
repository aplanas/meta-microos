SUMMARY = "The Linode command-line interface"
DESCRIPTION = "The Linode Command Line interface"
LICENSE = "BSD-3-Clause"

PV = "5.25.0"

RPM_NAME = "python310-linode-cli-5.25.0-1.6.aarch64.rpm"
RPM_HASH = "15f95f6c60e85f3588d7aef61ee3e85ee8963fb71b9b227d63d56ded1f44109a44c3b668e224f033733743de56f1c5500fd69c4b9e59c16ac4893f4d07f54f10"

RPROVIDES:${PN} += "python3.10dist-linode-cli \
python310-linode-cli \
python3dist-linode-cli"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-requests \
python310-terminaltables \
update-alternatives"

inherit rpm
