SUMMARY = "Android APK packager for Python scripts and apps"
DESCRIPTION = "Android APK packager for Python scripts and apps"
LICENSE = "MIT"

PV = "2023.2.10"

RPM_NAME = "python39-python-for-android-2023.2.10-1.2.noarch.rpm"
RPM_HASH = "421f7d899aef64c0c1b13ae745257f584a2c67da0263ddeffc1d58c7bdbc265b6822222bcb8b9af307bded2c18a6938996beaa6a478aa9a91bee3c7cab96c764"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-for-android \
python39-python-for-android \
python3dist-python-for-android"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Jinja2 \
python39-appdirs \
python39-build \
python39-colorama \
python39-toml \
update-alternatives"

inherit rpm
