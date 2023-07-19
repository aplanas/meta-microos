SUMMARY = "WxWidgets backend for python310-matplotlib"
DESCRIPTION = "This package includes the wxWidgets-based wxagg backend \
for python310-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-wx-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "acb35891b78bcbaa50e183e66038e6bbe1eef9f43248eebd44c09553aaad390de4607507466ef83f7673aa10b92c69542b0d5f27d6b343399cd7a8fc302182d2"

RPROVIDES:${PN} += "python310-matplotlib-wx"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib \
python310-wxPython"

inherit rpm
