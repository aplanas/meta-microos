SUMMARY = "Python library for manipulating URLs (and some URIs) in a more natural way"
DESCRIPTION = "URLObject is a utility class for manipulating URLs. The latest \
incarnation of this library builds upon the ideas of its predecessor, \
but aims for a clearer API, focusing on proper method names over \
operator overrides. It's also being developed from the ground up in a \
test-driven manner, and has full Sphinx documentation."
LICENSE = "SUSE-Public-Domain"

PV = "2.4.3"

RPM_NAME = "python311-URLObject-2.4.3-4.12.noarch.rpm"
RPM_HASH = "1d65d3d9b2bd1481f5297645817a499ef3c050976f70dfcd2a34010a019580012768699173558191bea9aaf39cea546ed564254263072093a6cca149417317e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(urlobject) \
python311-URLObject \
python3dist(urlobject)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
