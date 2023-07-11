SUMMARY = "OpenStack i18n library"
DESCRIPTION = "The oslo.i18n library contain utilities for working with internationalization \
(i18n) features, especially translation for text strings in an application \
or library. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "python3-oslo.i18n-6.0.0-2.1.noarch.rpm"
RPM_HASH = "8ee31ef766ba605585d1d5b41b781bcd4d1234384980748a9c539381db4a1eb66e63d2795fa5bc93dd633df2d02e5e49898546f9c671e70bf444796eedbbc5e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.i18n \
python3.11dist-oslo.i18n \
python3dist-oslo.i18n"

RDEPENDS:${PN} += "python-abi"

inherit rpm
