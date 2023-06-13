SUMMARY = "Wikipedia API for Python"
DESCRIPTION = "Wikipedia is a Python library that makes it easy to access and parse \
data from Wikipedia. \
 \
Search Wikipedia, get article summaries, get data like links and images \
from a page, and more. Wikipedia wraps the `MediaWiki \
API <https://www.mediawiki.org/wiki/API>`__ so you can focus on using \
Wikipedia data, not getting it."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python311-wikipedia-1.4.0-4.12.noarch.rpm"
RPM_HASH = "fb6e1dedfdfb5213c60230d0ce6c7586af3bbeede6a525e0a6d6cee9a0589441199ab77449d07998f7895b08ef5dc579856faac69a55b1e56ee659fb636ffc88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(wikipedia) \
python311-wikipedia \
python3dist(wikipedia)"

RDEPENDS:${PN} += "python(abi) \
python311-beautifulsoup4 \
python311-requests"

inherit rpm
