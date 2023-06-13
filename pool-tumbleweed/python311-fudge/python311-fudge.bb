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

RPM_NAME = "python311-fudge-1.1.1-6.7.noarch.rpm"
RPM_HASH = "a16f6efd2f8d0698621e7eb2d90e03dfc5d513f639488cd004f7eb75affcb03ebecc903ea545fdf4a07c94f23fbcba1456c15c5dfc5a99c03eab1c242eacb35c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(fudge) \
python311-fudge \
python3dist(fudge)"

RDEPENDS:${PN} += "python(abi) \
python311-six"

inherit rpm
