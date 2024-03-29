SUMMARY = "Programmable browser for functional black-box tests"
DESCRIPTION = "The zope.testbrowser package provides an programmable web browser \
with special focus on testing.  It is used in Zope, but it's not Zope \
specific.  It can be used to test or otherwise interact with any web \
site."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python310-zope.testbrowser-6.0-1.2.noarch.rpm"
RPM_HASH = "1b1216f24a71943f94974ba8626c8af6992b37064a183d796e845bf3540993577695ba84979e06861669d85d78810b255c0d1c945c47ec0ddd4f0249188710a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zope.testbrowser \
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
