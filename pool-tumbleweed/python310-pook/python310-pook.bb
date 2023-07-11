SUMMARY = "HTTP traffic mocking and expectations"
DESCRIPTION = "HTTP traffic mocking and expectations."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python310-pook-1.1.1-1.5.noarch.rpm"
RPM_HASH = "b1b610efd6a477b97ec90a01923baa3792578e60952eda86a8608fdfba9719fa2cd5ecce8fd01bf48beb41c97c4cb305eb86ebd8f9e853073b2a47e20f0e4bca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pook \
python310-pook \
python3dist-pook"

RDEPENDS:${PN} += "python-abi \
python310-aiohttp \
python310-furl \
python310-jsonschema \
python310-xmltodict"

inherit rpm
