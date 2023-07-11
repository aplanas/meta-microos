SUMMARY = "HTTP traffic mocking and expectations"
DESCRIPTION = "HTTP traffic mocking and expectations."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python311-pook-1.1.1-1.5.noarch.rpm"
RPM_HASH = "40c7a5ea8d53dfa1b850da0919d0acd0e56c6e6d7c3af8ae9d405179852ddbd873382c1ac2a38a5a17c2309183865d01d2c082e9ff1152785c9e853810473de1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pook \
python3.11dist-pook \
python311-pook \
python3dist-pook"

RDEPENDS:${PN} += "python-abi \
python311-aiohttp \
python311-furl \
python311-jsonschema \
python311-xmltodict"

inherit rpm
