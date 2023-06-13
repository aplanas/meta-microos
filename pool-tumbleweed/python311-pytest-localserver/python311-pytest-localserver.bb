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

RPM_NAME = "python311-pytest-localserver-0.7.1-1.1.noarch.rpm"
RPM_HASH = "550d2da8a22dd2b063e77a94dec02013a0a0325c5fd8319629dcc60254b27ea60a004994883bb2ae93ea34eada3a3e271f5dac3773cb5d951b1004ccf0082926"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-localserver) \
python311-pytest-localserver \
python3dist(pytest-localserver)"

RDEPENDS:${PN} += "python(abi) \
python311-Werkzeug \
python311-pytest"

inherit rpm
