SUMMARY = "Python library for manipulating URLs (and some URIs) in a more natural way"
DESCRIPTION = "URLObject is a utility class for manipulating URLs. The latest \
incarnation of this library builds upon the ideas of its predecessor, \
but aims for a clearer API, focusing on proper method names over \
operator overrides. It's also being developed from the ground up in a \
test-driven manner, and has full Sphinx documentation."
LICENSE = "SUSE-Public-Domain"

PV = "2.4.3"

RPM_NAME = "python39-URLObject-2.4.3-4.12.noarch.rpm"
RPM_HASH = "a2662b423bb928eb9887688d3398886bf4ebd9886ac58307717c27d97755b81fe1a8ed7dc4b4b3cb18fa4b2380cf2115cf7093e6746a6080fc290d6c0e34e6ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(urlobject) \
python39-URLObject \
python3dist(urlobject)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
