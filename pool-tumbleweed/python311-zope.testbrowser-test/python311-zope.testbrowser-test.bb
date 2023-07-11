SUMMARY = "Programmable browser for functional black-box tests"
DESCRIPTION = "The zope.testbrowser package provides an programmable web browser \
with special focus on testing.  It is used in Zope, but it's not Zope \
specific.  It can be used to test or otherwise interact with any web \
site."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python311-zope.testbrowser-test-6.0-1.3.noarch.rpm"
RPM_HASH = "d31c524c7c08c350f68f2cbe7c4cda0166c8ff736ec70b1ae53e870c609831671bc38d37037006295bd1d19dab86eeb1a2950a171bc264cee258c2b0b9320b8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.testbrowser-test \
python311-zope.testbrowser-test"

RDEPENDS:${PN} += "python311-WSGIProxy2 \
python311-WebTest \
python311-beautifulsoup4 \
python311-pytz \
python311-setuptools \
python311-soupsieve \
python311-zope.cachedescriptors \
python311-zope.interface \
python311-zope.schema"

inherit rpm
