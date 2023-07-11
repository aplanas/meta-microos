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

RPM_NAME = "python311-fudge-1.1.1-6.9.noarch.rpm"
RPM_HASH = "1c316440825b0467d5d0dae8c3e90980c33c611e812f53f6d0445c22d2cd3e2148863e49f06f8bc9737f68a60956555ec9577a728594f46d275215460a0a1756"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fudge \
python3.11dist-fudge \
python311-fudge \
python3dist-fudge"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
