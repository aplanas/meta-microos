SUMMARY = "HTML+JS page generator"
DESCRIPTION = "Generate HTML+JS pages with Python."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python311-branca-0.6.0-2.4.noarch.rpm"
RPM_HASH = "399d9ae256709d929488aea49c9fb6a09777a0d9f6e66a0a651bc4079c4931aff1003284e30d2cea1d88fb0b465695c0e33d387243d860d1fc1dd3bca6faeb9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-branca \
python3.11dist-branca \
python311-branca \
python3dist-branca"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2"

inherit rpm
