SUMMARY = "HTTP traffic mocking and expectations"
DESCRIPTION = "HTTP traffic mocking and expectations."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python39-pook-1.1.1-1.5.noarch.rpm"
RPM_HASH = "a5ac78641ad076d2345fd4a95b2c6e50b0c5885822916c62b43c52f25e4ed79fb1be4ac7525d85bf55850f5a30e7d249c79a88641bea24e33a79a58609bdefd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pook \
python39-pook \
python3dist-pook"

RDEPENDS:${PN} += "python-abi \
python39-aiohttp \
python39-furl \
python39-jsonschema \
python39-xmltodict"

inherit rpm
