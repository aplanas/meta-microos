SUMMARY = "A modern/fast Python SOAP client based on lxml / requests"
DESCRIPTION = "A modern/fast Python SOAP client based on lxml / requests"
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python311-softlayer-zeep-5.0.0-2.1.noarch.rpm"
RPM_HASH = "40d85dcba2f019a29b8bbe61cc01c6ef1c1a184d6859b201672b9d89b4371a5a278beba4b3feaf76d79818228d2a248639f92f9aea758fd229e5af4c2c5314a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-softlayer-zeep \
python3-zeep \
python3.11dist-softlayer-zeep \
python311-softlayer-zeep \
python311-zeep \
python3dist-softlayer-zeep"

RDEPENDS:${PN} += "python-abi \
python311-attrs \
python311-isodate \
python311-lxml \
python311-platformdirs \
python311-pytz \
python311-requests \
python311-requests-file \
python311-requests-toolbelt"

inherit rpm
