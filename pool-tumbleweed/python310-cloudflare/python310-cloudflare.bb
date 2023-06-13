SUMMARY = "Python wrapper for the Cloudflare v4 API"
DESCRIPTION = "Python wrapper for the Cloudflare Client API v4."
LICENSE = "MIT"

PV = "2.8.15"

RPM_NAME = "python310-cloudflare-2.8.15-1.7.noarch.rpm"
RPM_HASH = "42c8a19e2a8c9f64ecd9e3094f808e535e040f895f7fad979c084e34c7895eb8aac56238b6ffa5c51c2b8decd8c6497d097d164d87913824e9d478cfc552da09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cloudflare \
python3.10dist(cloudflare) \
python310-cloudflare \
python3dist(cloudflare)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-PyYAML \
python310-beautifulsoup4 \
python310-future \
python310-jsonlines \
python310-requests \
update-alternatives"

inherit rpm
