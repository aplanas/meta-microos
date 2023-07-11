SUMMARY = "Programmable browser for functional black-box tests"
DESCRIPTION = "The zope.testbrowser package provides an programmable web browser \
with special focus on testing.  It is used in Zope, but it's not Zope \
specific.  It can be used to test or otherwise interact with any web \
site."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python311-zope.testbrowser-6.0-1.2.noarch.rpm"
RPM_HASH = "3c6332167a9d384148bc2228e7b417e298cdff8da80d94e96575d3ec7c2cec53db353f86b8469df32b425e2dc00e357b5e148aab37592a5c80881a7eda1d5a34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.testbrowser \
python3.11dist-zope.testbrowser \
python311-zope.testbrowser \
python3dist-zope.testbrowser"

RDEPENDS:${PN} += "python-abi \
python311-WSGIProxy2 \
python311-WebTest \
python311-beautifulsoup4 \
python311-pytz \
python311-setuptools \
python311-soupsieve \
python311-zope.cachedescriptors \
python311-zope.interface \
python311-zope.schema"

inherit rpm
