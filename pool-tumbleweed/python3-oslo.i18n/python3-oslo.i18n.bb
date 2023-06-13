SUMMARY = "OpenStack i18n library"
DESCRIPTION = "The oslo.i18n library contain utilities for working with internationalization \
(i18n) features, especially translation for text strings in an application \
or library. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "python3-oslo.i18n-6.0.0-1.2.noarch.rpm"
RPM_HASH = "99e6f4e9d7c9caab75a7af5ed785d0fd1324b2ce6dfc5705f81208bc42a158c3a4495d896824a2f49abd7d3a91c3c267ee246367b286dbac3b23403be54dc3e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.i18n \
python3.10dist(oslo.i18n) \
python3dist(oslo.i18n)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
