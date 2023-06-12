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

RPM_NAME = "python310-fudge-1.1.1-6.7.noarch.rpm"
RPM_HASH = "86a5d006ddcaafd8027109e03ada2a6840c19d023d7cceaf0b398797f021f523ceaa511dc98a7ffc58ce1821a580c763f818e86039bbeee9da59d1033f12634d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fudge \
python3.10dist(fudge) \
python310-fudge \
python3dist(fudge)"
RDEPENDS:${PN} += "python(abi) \
python310-six"

inherit rpm
