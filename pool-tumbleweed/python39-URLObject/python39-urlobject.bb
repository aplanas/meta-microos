SUMMARY = "Python library for manipulating URLs (and some URIs) in a more natural way"
DESCRIPTION = "URLObject is a utility class for manipulating URLs. The latest \
incarnation of this library builds upon the ideas of its predecessor, \
but aims for a clearer API, focusing on proper method names over \
operator overrides. It's also being developed from the ground up in a \
test-driven manner, and has full Sphinx documentation."
LICENSE = "SUSE-Public-Domain"

PV = "2.4.3"

RPM_NAME = "python39-URLObject-2.4.3-4.14.noarch.rpm"
RPM_HASH = "c45f1ce93e31330da3bb81fa9ff87445cc67adba863c16202a577a076a241103c558a0d7b601b8bdd49b249ee6f1439b31b244482b0ad895f9be65fb2286726b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-urlobject \
python39-URLObject \
python3dist-urlobject"

RDEPENDS:${PN} += "python-abi"

inherit rpm
