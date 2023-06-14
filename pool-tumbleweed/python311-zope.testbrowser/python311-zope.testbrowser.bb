SUMMARY = "Programmable browser for functional black-box tests"
DESCRIPTION = "The zope.testbrowser package provides an programmable web browser \
with special focus on testing.  It is used in Zope, but it's not Zope \
specific.  It can be used to test or otherwise interact with any web \
site."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python311-zope.testbrowser-6.0-1.1.noarch.rpm"
RPM_HASH = "1922df45baf5a758e0625d51afd22b9f33972cbdd1f5a9e127a7ae950a814685bfcead2e81e542096c6f1fa1e733ced341ce910a6f3c0f7b3b7266bbf3142ab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-zope.testbrowser \
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
