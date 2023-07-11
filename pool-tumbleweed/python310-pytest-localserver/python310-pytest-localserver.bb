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

RPM_NAME = "python310-pytest-localserver-0.7.1-1.3.noarch.rpm"
RPM_HASH = "73884055b1a6602b4332eed64ab70cffda631ee36f64691a57061f0fce91fa5e8874dade1734c585ec6c4bddd3173e3306693d354c15ae1149dedbe548f202b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-localserver \
python310-pytest-localserver \
python3dist-pytest-localserver"

RDEPENDS:${PN} += "python-abi \
python310-Werkzeug \
python310-pytest"

inherit rpm
