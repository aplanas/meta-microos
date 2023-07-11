SUMMARY = "Module to diff JSON and JSON-like structures in Python"
DESCRIPTION = "Package to show differences between JSON and JSON-like structures in Python"
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-jsondiff-2.0.0-2.3.noarch.rpm"
RPM_HASH = "755ae7332efcbabad81ba25c26ea623c56cf097d5d5aa296de6265818fc816d248642453c330c744905587e266ee5e6ddc8431c617152c43c570e8785cf8b867"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jsondiff \
python310-jsondiff \
python3dist-jsondiff"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
