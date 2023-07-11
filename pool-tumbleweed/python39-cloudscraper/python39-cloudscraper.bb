SUMMARY = "A Python module to bypass Cloudflare's anti-bot page"
DESCRIPTION = "A Python module to bypass Cloudflare's anti-bot page."
LICENSE = "MIT"

PV = "1.2.58"

RPM_NAME = "python39-cloudscraper-1.2.58-3.13.noarch.rpm"
RPM_HASH = "e1e4e79fa5c6a2e996c1dade96cd26337d328ff9ff1759daf8d8953691d24c1f82982a762560f828d57266ba297c094da27b72955fad0ce5e68c06c83bc9c917"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cloudscraper \
python39-cloudscraper \
python3dist-cloudscraper"

RDEPENDS:${PN} += "python-abi \
python39-pyparsing \
python39-requests \
python39-requests-toolbelt"

inherit rpm
