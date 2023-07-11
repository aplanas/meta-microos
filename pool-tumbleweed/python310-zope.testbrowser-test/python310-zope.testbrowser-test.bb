SUMMARY = "Programmable browser for functional black-box tests"
DESCRIPTION = "The zope.testbrowser package provides an programmable web browser \
with special focus on testing.  It is used in Zope, but it's not Zope \
specific.  It can be used to test or otherwise interact with any web \
site."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python310-zope.testbrowser-test-6.0-1.3.noarch.rpm"
RPM_HASH = "876c95dcb3eaa41beb7a10ea173dd8243417d310fdd7bbea9131682d63ec834f4300915091104f27f9cf8a2db210466ca44c39638438e93388febb14d5643f89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-zope.testbrowser-test"

RDEPENDS:${PN} += "python310-WSGIProxy2 \
python310-WebTest \
python310-beautifulsoup4 \
python310-pytz \
python310-setuptools \
python310-soupsieve \
python310-zope.cachedescriptors \
python310-zope.interface \
python310-zope.schema"

inherit rpm
