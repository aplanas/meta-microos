SUMMARY = "The Linode command-line interface"
DESCRIPTION = "The Linode Command Line interface"
LICENSE = "BSD-3-Clause"

PV = "5.25.0"

RPM_NAME = "python311-linode-cli-5.25.0-1.4.aarch64.rpm"
RPM_HASH = "1237316159ca21bee69bf648f245de4ed8800ed5151300aaf7d41256b554329a197f194cd9011a696fadd0ec4ba55779ad8e46796e983aba2d0cdf1fd12d1dfc"

RPROVIDES:${PN} += "python3.11dist(linode-cli) \
python311-linode-cli \
python311-linode-cli(aarch-64) \
python3dist(linode-cli)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-PyYAML \
python311-requests \
python311-terminaltables \
update-alternatives"

inherit rpm
