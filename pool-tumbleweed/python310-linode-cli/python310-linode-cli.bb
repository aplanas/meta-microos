SUMMARY = "The Linode command-line interface"
DESCRIPTION = "The Linode Command Line interface"
LICENSE = "BSD-3-Clause"

PV = "5.25.0"

RPM_NAME = "python310-linode-cli-5.25.0-1.4.aarch64.rpm"
RPM_HASH = "0d595cc35d7676357efeb609ce896d91e0ada5933987b55cf12618d46346119b6539cf928987e6aa7c9485fad7faab31ecb0bc97ef0176235f78a49c60fe0def"

RPROVIDES:${PN} += "python3-linode-cli \
python3.10dist(linode-cli) \
python310-linode-cli \
python310-linode-cli(aarch-64) \
python3dist(linode-cli)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-PyYAML \
python310-requests \
python310-terminaltables \
update-alternatives"

inherit rpm
