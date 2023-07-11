SUMMARY = "Module to diff JSON and JSON-like structures in Python"
DESCRIPTION = "Package to show differences between JSON and JSON-like structures in Python"
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-jsondiff-2.0.0-2.3.noarch.rpm"
RPM_HASH = "082e675c6128b7abaa8a05ed54caefd419d188c9323b33d4b92d2c98c462c09f3b3570fe4fd618871f84a25faecbbfd93d1629aed349f15dbbcd6d8d4440478f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsondiff \
python3.11dist-jsondiff \
python311-jsondiff \
python3dist-jsondiff"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
