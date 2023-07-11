SUMMARY = "The Linode command-line interface"
DESCRIPTION = "The Linode Command Line interface"
LICENSE = "BSD-3-Clause"

PV = "5.25.0"

RPM_NAME = "python39-linode-cli-5.25.0-1.6.aarch64.rpm"
RPM_HASH = "771bb575a0bcc23615e242afa80016a3cb26bca1a79865b5c4228fb7cf458dbd7778b6c1c548d2d81f8e6575efc503d7423dde296bb8d1fb7a6b09445839f8be"

RPROVIDES:${PN} += "python3.9dist-linode-cli \
python39-linode-cli \
python3dist-linode-cli"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-requests \
python39-terminaltables \
update-alternatives"

inherit rpm
