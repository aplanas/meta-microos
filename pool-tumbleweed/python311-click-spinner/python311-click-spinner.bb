SUMMARY = "Spinner for Click"
DESCRIPTION = "Spinner for Click."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python311-click-spinner-0.1.10-2.5.noarch.rpm"
RPM_HASH = "256f060ca49c714248aaa35e9b426aef1e416ea2dab4f9c2e5e70a15b86b25265b68508b76bbcdd9df7e6c9dd608a448817c666fd0d1ecb07dc553caf14fbc5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-spinner \
python3.11dist-click-spinner \
python311-click-spinner \
python3dist-click-spinner"

RDEPENDS:${PN} += "python-abi \
python311-click"

inherit rpm
