SUMMARY = "HTTP traffic mocking and expectations"
DESCRIPTION = "HTTP traffic mocking and expectations."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python310-pook-1.1.1-1.3.noarch.rpm"
RPM_HASH = "59c2ad11cbd940a686255d16ffc736c26611c102ce42ad94908c1b683e2a8921f778be0bb94ceb4515be4603a9305ef484ab50d49a69cca3e9652bd3d70ffad4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pook \
python3.10dist-pook \
python310-pook \
python3dist-pook"

RDEPENDS:${PN} += "python-abi \
python310-aiohttp \
python310-furl \
python310-jsonschema \
python310-xmltodict"

inherit rpm
