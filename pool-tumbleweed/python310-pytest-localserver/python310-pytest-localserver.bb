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

RPM_NAME = "python310-pytest-localserver-0.7.1-1.1.noarch.rpm"
RPM_HASH = "8b72189a69c23146e8252b807f21b08b211e736824775539c9db7fcb1e71cf446141b31f815878a4fba4e7799bf283032a1622a59f28ab0415d8d2ed4a89b556"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-localserver \
python3.10dist(pytest-localserver) \
python310-pytest-localserver \
python3dist(pytest-localserver)"

RDEPENDS:${PN} += "python(abi) \
python310-Werkzeug \
python310-pytest"

inherit rpm
