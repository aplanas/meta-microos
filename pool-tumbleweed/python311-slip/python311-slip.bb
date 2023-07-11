SUMMARY = "Miscellaneous convenience, extension and workaround code for Python"
DESCRIPTION = "The Simple Library for Python packages contain miscellaneous code for \
convenience, extension and workaround purposes. \
 \
This package provides the 'slip' and the 'slip.util' modules."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.5"

RPM_NAME = "python311-slip-0.6.5-6.16.noarch.rpm"
RPM_HASH = "2b5cec0ba56bb7825f640350869ee77f1d5f3f63791e6be165cfbd8844d0bab243dd69f5d722ed3f5dab66ac5346a9dd8b9d1fe536c15eeadbad4265c70197a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-slip \
python3.11dist-slip \
python311-slip \
python3dist-slip"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
