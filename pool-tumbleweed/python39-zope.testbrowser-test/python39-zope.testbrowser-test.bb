SUMMARY = "Programmable browser for functional black-box tests"
DESCRIPTION = "The zope.testbrowser package provides an programmable web browser \
with special focus on testing.  It is used in Zope, but it's not Zope \
specific.  It can be used to test or otherwise interact with any web \
site."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python39-zope.testbrowser-test-6.0-1.3.noarch.rpm"
RPM_HASH = "2847beb0497129acde287367181efe156f37d786363e1ed2e3d54e9e91ac7d7a315254276bdaea43fb7734883bbe3d12ccd3de0efd5561d62fae3406df8da8a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-zope.testbrowser-test"

RDEPENDS:${PN} += "python39-WSGIProxy2 \
python39-WebTest \
python39-beautifulsoup4 \
python39-pytz \
python39-setuptools \
python39-soupsieve \
python39-zope.cachedescriptors \
python39-zope.interface \
python39-zope.schema"

inherit rpm
