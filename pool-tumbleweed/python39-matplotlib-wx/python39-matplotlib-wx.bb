SUMMARY = "WxWidgets backend for python39-matplotlib"
DESCRIPTION = "This package includes the wxWidgets-based wxagg backend \
for python39-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-wx-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "3e9ba053ab6155c9146b6c71a40bf941b768e84461fa7933ec0b37c6dd874d398db292e8b4fe010109be5cd3f0419c07532566335c08c0c8669604389f59502c"

RPROVIDES:${PN} += "python39-matplotlib-wx"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib \
python39-wxPython"

inherit rpm
