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

RPM_NAME = "python311-wikipedia-1.4.0-4.14.noarch.rpm"
RPM_HASH = "9ff78275cc4a6cd7e62708c8ca98c1b044592d3ed9b95534dc37b82166dcc36f8b7e062deea5202e9f36e41b745acc1c79785576e10d1faa6254efa813993df9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wikipedia \
python3.11dist-wikipedia \
python311-wikipedia \
python3dist-wikipedia"

RDEPENDS:${PN} += "python-abi \
python311-beautifulsoup4 \
python311-requests"

inherit rpm
