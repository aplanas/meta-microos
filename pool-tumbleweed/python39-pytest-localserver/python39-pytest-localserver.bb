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

PV = "0.8.0"

RPM_NAME = "python39-pytest-localserver-0.8.0-1.1.noarch.rpm"
RPM_HASH = "31cab9286f8efd821bc0215db5aaf8aed1e4a2bdb7f12013e36e401fad69aa13aeed70baec4b61204c91b3bf8a8202162f0eb6f8ebc27ae0b048b92501de057d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-localserver \
python39-pytest-localserver \
python3dist-pytest-localserver"

RDEPENDS:${PN} += "python-abi \
python39-Werkzeug \
python39-pytest"

inherit rpm
