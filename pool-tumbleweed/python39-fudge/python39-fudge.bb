SUMMARY = "Module for replacing real objects with fakes (mocks, stubs, etc) while testing"
DESCRIPTION = "Fudge is a Python module for using fake objects (mocks and stubs) to test real ones. \
 \
In readable Python code, you declare what methods are available on your fake and \
how they should be called. Then you inject that into your application and start \
testing. This declarative approach means you don't have to record and playback \
actions and you don't have to inspect your fakes after running code. If the fake \
object was used incorrectly then you'll see an informative exception message \
with a traceback that points to the culprit."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python39-fudge-1.1.1-6.9.noarch.rpm"
RPM_HASH = "d8e82dbd6fa6f62b64863fbb8f13842dcc585b51a4180bba5924ee64ad8a7aaebdbac34936bb381be3929030019f21abad362e58083572049d28a5fb397b94bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fudge \
python39-fudge \
python3dist-fudge"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
