SUMMARY = "Web backend for python311-matplotlib"
DESCRIPTION = "This package includes the browser-based webagg backend \
for the python311-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-web-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "07f91247438b271b951fa55d13b122688eb618d5883dd783bba84f90c649679d72340c848997491ee325c4bf6058bd056091bd79cfdca9035cc2d6cd78b67fc0"

RPROVIDES:${PN} += "python3-matplotlib-web \
python311-matplotlib-web"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib \
python311-tornado"

inherit rpm
