SUMMARY = "Web backend for python311-matplotlib"
DESCRIPTION = "This package includes the browser-based webagg backend \
for the python311-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-web-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "34410e1afcc9b1078648ae9361c1a23e424c86987387bbddf68f632a1e457c48f608285483143bfbae0b239b91f19e9ce620a97ebdd3a2c7c5488e39fb858878"

RPROVIDES:${PN} += "python3-matplotlib-web \
python311-matplotlib-web"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib \
python311-tornado"

inherit rpm
