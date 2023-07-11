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

RPM_NAME = "python311-pytest-localserver-0.7.1-1.3.noarch.rpm"
RPM_HASH = "1f6e1ef73614f2a765d325c9e158353e71450dd05ed9bc8d000b146898adbf703869d3f7a4d9cdfb299aa7e16c3d05ff0d0580073fc535263a14682b47a09074"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-localserver \
python3.11dist-pytest-localserver \
python311-pytest-localserver \
python3dist-pytest-localserver"

RDEPENDS:${PN} += "python-abi \
python311-Werkzeug \
python311-pytest"

inherit rpm
