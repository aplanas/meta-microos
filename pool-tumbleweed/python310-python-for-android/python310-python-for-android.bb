SUMMARY = "Android APK packager for Python scripts and apps"
DESCRIPTION = "Android APK packager for Python scripts and apps"
LICENSE = "MIT"

PV = "2023.2.10"

RPM_NAME = "python310-python-for-android-2023.2.10-1.2.noarch.rpm"
RPM_HASH = "770814ee15f3c0abd7b5a3fde736ac664d87dd507e103517746eb3333351662541677b9af119d66ad790261fcd354266ce6dceb9750d00057133cc3c60a77adc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-for-android \
python310-python-for-android \
python3dist-python-for-android"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Jinja2 \
python310-appdirs \
python310-build \
python310-colorama \
python310-toml \
update-alternatives"

inherit rpm
