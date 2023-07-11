SUMMARY = "Python library for manipulating URLs (and some URIs) in a more natural way"
DESCRIPTION = "URLObject is a utility class for manipulating URLs. The latest \
incarnation of this library builds upon the ideas of its predecessor, \
but aims for a clearer API, focusing on proper method names over \
operator overrides. It's also being developed from the ground up in a \
test-driven manner, and has full Sphinx documentation."
LICENSE = "SUSE-Public-Domain"

PV = "2.4.3"

RPM_NAME = "python310-URLObject-2.4.3-4.14.noarch.rpm"
RPM_HASH = "e82f577b9b8274d49f6f830230246daabeaab42a4e9c81bf752375702e61753b58356cf5f83388098c23f65792e4e5ca3fc82afc9c69d500e98bdc9dba7767b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-urlobject \
python310-URLObject \
python3dist-urlobject"

RDEPENDS:${PN} += "python-abi"

inherit rpm
