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

RPM_NAME = "python39-wikipedia-1.4.0-4.12.noarch.rpm"
RPM_HASH = "474b34833980ef6383846d06e4e3895fdf0ba0b2a186958d05968bdfa002a62ab97cc52b949beb7912b7ea597fb59255e52116418ddb8e5997410cef2e12263b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wikipedia \
python39-wikipedia \
python3dist-wikipedia"

RDEPENDS:${PN} += "python-abi \
python39-beautifulsoup4 \
python39-requests"

inherit rpm
