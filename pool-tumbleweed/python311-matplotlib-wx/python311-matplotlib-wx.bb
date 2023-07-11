SUMMARY = "WxWidgets backend for python311-matplotlib"
DESCRIPTION = "This package includes the wxWidgets-based wxagg backend \
for python311-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-wx-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "31ac5d18e365f5272ba04219ab3b10d0b7affe9cd305597753e79dda31f0573d185f21faed0a8f992aaf2a44fa4dfe5997003a6bb5b39eb50b6076df7547b378"

RPROVIDES:${PN} += "python3-matplotlib-wx \
python311-matplotlib-wx"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib \
python311-wxPython"

inherit rpm
