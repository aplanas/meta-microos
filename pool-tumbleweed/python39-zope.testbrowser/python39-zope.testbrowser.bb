SUMMARY = "Programmable browser for functional black-box tests"
DESCRIPTION = "The zope.testbrowser package provides an programmable web browser \
with special focus on testing.  It is used in Zope, but it's not Zope \
specific.  It can be used to test or otherwise interact with any web \
site."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python39-zope.testbrowser-6.0-1.2.noarch.rpm"
RPM_HASH = "f427e2cbc3612a8c59b663b24c1613bdebe020bd32a85133f6fe8073725a02dee5fa05e4ebe4d8939d4ce58192e4106a983c343b35de5ada548ec32ef2cd9045"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zope.testbrowser \
python39-zope.testbrowser \
python3dist-zope.testbrowser"

RDEPENDS:${PN} += "python-abi \
python39-WSGIProxy2 \
python39-WebTest \
python39-beautifulsoup4 \
python39-pytz \
python39-setuptools \
python39-soupsieve \
python39-zope.cachedescriptors \
python39-zope.interface \
python39-zope.schema"

inherit rpm
