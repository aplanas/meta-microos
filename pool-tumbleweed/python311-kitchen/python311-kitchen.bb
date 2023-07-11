SUMMARY = "Kitchen contains a cornucopia of useful code"
DESCRIPTION = "A bunch of useful python functions to be used in other projects."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.6"

RPM_NAME = "python311-kitchen-1.2.6-4.12.noarch.rpm"
RPM_HASH = "14ae8f19d5b789b25973aa03f7c8db08e6c622cd18d832fdd66d6fb465eb1ee1534cba99ad01113b0f36c532ba40db83002d1ab8bb50cea0d1f5f66c469fc18e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kitchen \
python3.11dist-kitchen \
python311-kitchen \
python3dist-kitchen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
