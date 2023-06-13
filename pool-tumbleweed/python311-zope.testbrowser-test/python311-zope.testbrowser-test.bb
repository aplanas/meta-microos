SUMMARY = "Programmable browser for functional black-box tests"
DESCRIPTION = "The zope.testbrowser package provides an programmable web browser \
with special focus on testing.  It is used in Zope, but it's not Zope \
specific.  It can be used to test or otherwise interact with any web \
site."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python311-zope.testbrowser-test-6.0-1.1.noarch.rpm"
RPM_HASH = "5e6767cbd47b2384c9d16060bc95283d7b90961b7e2cceb55a296f09b546fba8bc17aecfe86df9cf83056b8f1d39fe6b294d16c9597ceb2c02ae3bc87ba8bff6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-zope.testbrowser-test"

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
