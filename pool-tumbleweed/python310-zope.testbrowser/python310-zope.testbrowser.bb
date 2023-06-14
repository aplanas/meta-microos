SUMMARY = "Programmable browser for functional black-box tests"
DESCRIPTION = "The zope.testbrowser package provides an programmable web browser \
with special focus on testing.  It is used in Zope, but it's not Zope \
specific.  It can be used to test or otherwise interact with any web \
site."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python310-zope.testbrowser-6.0-1.1.noarch.rpm"
RPM_HASH = "71af020bb7582e309855dce9ed88e2f884b5a66faa84dc2c575d09a18ae9dc9fc5f94d2e08294bd93b742e555cf8033b5d66d68b5438b9d75197dd9e2e2400d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.testbrowser \
python3.10dist-zope.testbrowser \
python310-zope.testbrowser \
python3dist-zope.testbrowser"

RDEPENDS:${PN} += "python-abi \
python310-WSGIProxy2 \
python310-WebTest \
python310-beautifulsoup4 \
python310-pytz \
python310-setuptools \
python310-soupsieve \
python310-zope.cachedescriptors \
python310-zope.interface \
python310-zope.schema"

inherit rpm
