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

RPM_NAME = "python311-pytest-localserver-0.8.0-1.1.noarch.rpm"
RPM_HASH = "bced3c3ec19c23ea59f201a40155344ad73858eec920e03113e02947d0ebdc3446d1accf71bbc1c38723240512b6c1c90c5220bb18a1f8efcd5114f53351dce5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-localserver \
python3.11dist-pytest-localserver \
python311-pytest-localserver \
python3dist-pytest-localserver"

RDEPENDS:${PN} += "python-abi \
python311-Werkzeug \
python311-pytest"

inherit rpm
