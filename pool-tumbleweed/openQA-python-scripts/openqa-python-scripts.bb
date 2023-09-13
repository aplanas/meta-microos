SUMMARY = "Additional scripts in python"
DESCRIPTION = "Additional scripts for the use of openQA in the python programming language."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1694101660.598baea"

RPM_NAME = "openQA-python-scripts-4.6.1694101660.598baea-1.1.aarch64.rpm"
RPM_HASH = "b825fffa908b7927f355420c723d4d34af8b58f8aa9bd38a07d467e36c4a4800febcc0e992c85313f5aa89351346407acf993ca7d7148b3b26930cf84ef23a9b"

RPROVIDES:${PN} += "openQA-python-scripts"

RDEPENDS:${PN} += "/usr/bin/python3 \
openQA-client \
python3-base \
python3-requests"

inherit rpm
