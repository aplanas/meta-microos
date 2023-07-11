SUMMARY = "Android APK packager for Python scripts and apps"
DESCRIPTION = "Android APK packager for Python scripts and apps"
LICENSE = "MIT"

PV = "2023.2.10"

RPM_NAME = "python311-python-for-android-2023.2.10-1.2.noarch.rpm"
RPM_HASH = "4adca7e56d18ac0ca50b816364a5758c6fcef9b4e42f41114b3efba180a28c37e2beb4079047bfdb39dcae8e1e5648968c1cfd03440efb33f497f0327b73e9f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-for-android \
python3.11dist-python-for-android \
python311-python-for-android \
python3dist-python-for-android"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Jinja2 \
python311-appdirs \
python311-build \
python311-colorama \
python311-toml \
update-alternatives"

inherit rpm
