SUMMARY = "Plugin for py.test to test server connections locally"
DESCRIPTION = "The pytest-localserver package is a plugin for the `pytest`_ testing framework \
which enables you to test server connections locally. \
 \
Sometimes `monkeypatching`_ ``urllib2.urlopen()`` just does not cut it, for \
instance if you work with ``urllib2.Request``, define your own openers/handlers \
or work with ``httplib``. In these cases it may come in handy to have an HTTP \
server running locally which behaves just like the real thing. Well, look \
no further!"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python39-pytest-localserver-0.7.1-1.3.noarch.rpm"
RPM_HASH = "4a671311cc8740e39f67addabc3a846a3a848762d45f1fc9e7049bcd5759e2c81d127049517abda32829e707b2e08e48f173fba8e359086fcb77b78861d79fcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-localserver \
python39-pytest-localserver \
python3dist-pytest-localserver"

RDEPENDS:${PN} += "python-abi \
python39-Werkzeug \
python39-pytest"

inherit rpm
