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

RPM_NAME = "python39-pytest-localserver-0.7.1-1.1.noarch.rpm"
RPM_HASH = "e19a98c83e6bfb11d28f34e201413ddee655b3820749381b1b5b11f341ff86a853b4837485225c89319b661d11c1f1d0371fd1538edef4557d250155706eab7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-localserver \
python39-pytest-localserver \
python3dist-pytest-localserver"

RDEPENDS:${PN} += "python-abi \
python39-Werkzeug \
python39-pytest"

inherit rpm
