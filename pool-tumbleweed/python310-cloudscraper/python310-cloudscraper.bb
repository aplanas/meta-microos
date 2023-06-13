SUMMARY = "A Python module to bypass Cloudflare's anti-bot page"
DESCRIPTION = "A Python module to bypass Cloudflare's anti-bot page."
LICENSE = "MIT"

PV = "1.2.58"

RPM_NAME = "python310-cloudscraper-1.2.58-3.11.noarch.rpm"
RPM_HASH = "d64131945c1e37383a045da8de280d4fcb3e1ef27bf8614d796e6f2ec1e6482bf426d43eae8ae7b2274ea90575c6d96f1b57fdb664b312540df165eca2e9c909"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cloudscraper \
python3.10dist(cloudscraper) \
python310-cloudscraper \
python3dist(cloudscraper)"

RDEPENDS:${PN} += "python(abi) \
python310-pyparsing \
python310-requests \
python310-requests-toolbelt"

inherit rpm
