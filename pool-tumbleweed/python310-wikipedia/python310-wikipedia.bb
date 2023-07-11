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

RPM_NAME = "python310-wikipedia-1.4.0-4.14.noarch.rpm"
RPM_HASH = "9a9ab5eedd33b7af7f767c4a19b8f9915f70531327eeead50b4ad626be25472d9241628bd8a05ba3fe01ff4667137cd2975383b223cfbaf02719af621fbbc1c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wikipedia \
python310-wikipedia \
python3dist-wikipedia"

RDEPENDS:${PN} += "python-abi \
python310-beautifulsoup4 \
python310-requests"

inherit rpm
