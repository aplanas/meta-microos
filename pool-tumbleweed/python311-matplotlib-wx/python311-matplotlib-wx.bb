SUMMARY = "WxWidgets backend for python311-matplotlib"
DESCRIPTION = "This package includes the wxWidgets-based wxagg backend \
for python311-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-wx-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "62794e3f12bdc79dae089bfa572dab7803985505ac64ec9d83c1935039aab4558df00302b5cbd3b3f27f20a5b73d310cd3cbbd1ff032062460adaf511a186983"

RPROVIDES:${PN} += "python311-matplotlib-wx"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib \
python311-wxPython"

inherit rpm
