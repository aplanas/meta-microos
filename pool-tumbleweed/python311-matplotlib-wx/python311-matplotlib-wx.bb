SUMMARY = "WxWidgets backend for python311-matplotlib"
DESCRIPTION = "This package includes the wxWidgets-based wxagg backend \
for python311-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-wx-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "4630972d2b7163ee64af7be1cad91e05421756e3e9503c8938ea2efc398ac0c840123f7cdf6c127ebe0641ef7ad5738659b0048af072a6eda9faa1c7d835fa87"

RPROVIDES:${PN} += "python3-matplotlib-wx \
python311-matplotlib-wx"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib \
python311-wxPython"

inherit rpm
