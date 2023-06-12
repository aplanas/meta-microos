SUMMARY = "Development documentation for Coin"
DESCRIPTION = "Coin is a scene-graph based, retain-mode, rendering and model \
manipulation C++ class library. \
 \
This package contains the API and other development documentation."
LICENSE = "BSD-3-Clause"

PV = "4.0.0"

RPM_NAME = "Coin4-devel-doc-4.0.0-1.7.aarch64.rpm"
RPM_HASH = "45a137f4fd39d5655996036f89ff151759ea8a601368df481ef7102034b7616aff007d4f930b4b35380986bd31c7bb784f8d066a6932162f54d03c6ec384acc0"

RPROVIDES:${PN} += "Coin4-devel-doc \
Coin4-devel-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
