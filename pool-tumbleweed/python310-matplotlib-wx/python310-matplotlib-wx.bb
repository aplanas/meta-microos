SUMMARY = "WxWidgets backend for python310-matplotlib"
DESCRIPTION = "This package includes the wxWidgets-based wxagg backend \
for python310-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-wx-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "e4940f703acdd0f25978078fb949a053069a209e67241faf7175b8e1fb83a8c4d743155207f436f69a00ea6e7b0b2868665fa49ae323557407a193e70c4a4cac"

RPROVIDES:${PN} += "python310-matplotlib-wx"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib \
python310-wxPython"

inherit rpm
