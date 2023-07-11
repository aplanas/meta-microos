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

RPM_NAME = "python310-fudge-1.1.1-6.9.noarch.rpm"
RPM_HASH = "4ad35a6912b4fc577c844f66c8e4623c66d79669af69541a6022d711004757ffdd7dc0d6a0ce4ba9666181b8db42df7d3bced55ad63a6ad7cc2dd18dfaddb35a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fudge \
python310-fudge \
python3dist-fudge"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
