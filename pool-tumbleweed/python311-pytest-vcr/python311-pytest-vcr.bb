SUMMARY = "Plugin for managing VCR.py cassettes"
DESCRIPTION = "Plugin for managing VCR.py cassettes."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python311-pytest-vcr-1.0.2-2.3.noarch.rpm"
RPM_HASH = "d733ff4046d9721329c76ca8051b9d03fc96166dc9e89dc360c3ae14b0531bda20ea6c9b5850b554630718a5a0ddcb25a0d8d5bb2a3adcfec3805bab25010f25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-vcr \
python3.11dist-pytest-vcr \
python311-pytest-vcr \
python3dist-pytest-vcr"

RDEPENDS:${PN} += "python-abi \
python311-pytest \
python311-vcrpy"

inherit rpm
