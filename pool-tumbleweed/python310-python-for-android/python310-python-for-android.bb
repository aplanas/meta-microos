SUMMARY = "Android APK packager for Python scripts and apps"
DESCRIPTION = "Android APK packager for Python scripts and apps"
LICENSE = "MIT"

PV = "2023.2.10"

RPM_NAME = "python310-python-for-android-2023.2.10-1.1.noarch.rpm"
RPM_HASH = "b657d087c5443d686e2e15589386a8bc8208597a167c97cae77f9d3dde641429e88ba3f33f4d7acf2dfbb9830cf50dabe0c8f73ae8b098f3ca308c56021925fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-for-android \
python3.10dist(python-for-android) \
python310-python-for-android \
python3dist(python-for-android)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
/usr/bin/python3.10 \
python(abi) \
python310-Jinja2 \
python310-appdirs \
python310-build \
python310-colorama \
python310-toml \
update-alternatives"

inherit rpm
