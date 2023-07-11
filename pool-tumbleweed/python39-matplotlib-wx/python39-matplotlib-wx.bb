SUMMARY = "WxWidgets backend for python39-matplotlib"
DESCRIPTION = "This package includes the wxWidgets-based wxagg backend \
for python39-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-wx-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "88b2b2ce7af827d158656de5d005a79b96d8f89628c1fcaa5faf27d41c8909778aace5396b1359f8f870dfef887a821a4c6f498509a2bf0390d7867eb1e0d149"

RPROVIDES:${PN} += "python39-matplotlib-wx"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib \
python39-wxPython"

inherit rpm
