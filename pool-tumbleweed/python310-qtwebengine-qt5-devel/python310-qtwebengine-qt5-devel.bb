SUMMARY = "Development files for python310-qtwebengine-qt5"
DESCRIPTION = "This package provides the framework API files for the Eric IDE. \
and  the SIP files used to generate the Python bindings for python310-qtwebengine-qt5"
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python310-qtwebengine-qt5-devel-5.15.6-1.7.aarch64.rpm"
RPM_HASH = "fb26f124fb55cd4e4fbbcd84422ebde6d076289a8caee45e35759fde0f7b2cc7f9e03dee5a2af94f5eab7ad6d29598ddf6a9192b5a4c951cfee9e0eda5334f2f"

RPROVIDES:${PN} += "python-qtwebengine-qt5-sip \
python3-qtwebengine-qt5-api \
python3-qtwebengine-qt5-devel \
python3-qtwebengine-qt5-sip \
python310-qtwebengine-qt5-api \
python310-qtwebengine-qt5-devel \
python310-qtwebengine-qt5-devel(aarch-64) \
python310-qtwebengine-qt5-sip"

RDEPENDS:${PN} += "python(abi) \
python310-qt5-devel"

inherit rpm
