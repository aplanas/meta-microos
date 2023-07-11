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

RPM_NAME = "python39-wikipedia-1.4.0-4.14.noarch.rpm"
RPM_HASH = "09f436a35280295ac4e115631f5248b66412cb726bf29c787e6acdc1f66f31fc8d1ae79cc44730d07229045d753503f007950aa1381e79ab3822776864c05e8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wikipedia \
python39-wikipedia \
python3dist-wikipedia"

RDEPENDS:${PN} += "python-abi \
python39-beautifulsoup4 \
python39-requests"

inherit rpm
