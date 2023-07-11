SUMMARY = "Python library for manipulating URLs (and some URIs) in a more natural way"
DESCRIPTION = "URLObject is a utility class for manipulating URLs. The latest \
incarnation of this library builds upon the ideas of its predecessor, \
but aims for a clearer API, focusing on proper method names over \
operator overrides. It's also being developed from the ground up in a \
test-driven manner, and has full Sphinx documentation."
LICENSE = "SUSE-Public-Domain"

PV = "2.4.3"

RPM_NAME = "python311-URLObject-2.4.3-4.14.noarch.rpm"
RPM_HASH = "48f6b6effaa32ef3fd591004b5ae77435bf7e53a9d3abf23a54e83d5c9c02cd2f0c374f837c674a64bcb0464e3d3da3ba271600aefe5cce537f74c9e5e4b931a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-URLObject \
python3.11dist-urlobject \
python311-URLObject \
python3dist-urlobject"

RDEPENDS:${PN} += "python-abi"

inherit rpm
