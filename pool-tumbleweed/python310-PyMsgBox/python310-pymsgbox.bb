SUMMARY = "A Python module for JavaScript-like message boxes"
DESCRIPTION = "A pure Python module for JavaScript-like message boxes."
LICENSE = "BSD-3-Clause"

PV = "1.0.9"

RPM_NAME = "python310-PyMsgBox-1.0.9-1.4.noarch.rpm"
RPM_HASH = "8385c88af4f32adc90fab740ca9eca8d50175a9da8064766b086e3300b8fdab7f5350aea67f701452380573667de35e3be842a85d8978d1b30da7ea900afa46e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pymsgbox \
python310-PyMsgBox \
python3dist-pymsgbox"

RDEPENDS:${PN} += "python-abi"

inherit rpm
