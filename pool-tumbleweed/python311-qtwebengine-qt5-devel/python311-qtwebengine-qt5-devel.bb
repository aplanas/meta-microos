SUMMARY = "Development files for python311-qtwebengine-qt5"
DESCRIPTION = "This package provides the framework API files for the Eric IDE. \
and  the SIP files used to generate the Python bindings for python311-qtwebengine-qt5"
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python311-qtwebengine-qt5-devel-5.15.6-1.7.aarch64.rpm"
RPM_HASH = "5a968956fbb25325703d7da843543e4e203d791e74374f2895918b09be13aeae5bf9b05d64398e3477ffa4f65a9fc0eeaaba58e5be05b2e5a3dcfbb43a924716"

RPROVIDES:${PN} += "python-qtwebengine-qt5-sip \
python311-qtwebengine-qt5-api \
python311-qtwebengine-qt5-devel \
python311-qtwebengine-qt5-devel(aarch-64) \
python311-qtwebengine-qt5-sip"
RDEPENDS:${PN} += "python(abi) \
python311-qt5-devel"

inherit rpm
