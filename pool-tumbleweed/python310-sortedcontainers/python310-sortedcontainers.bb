SUMMARY = "Sorted container data types"
DESCRIPTION = "SortedContainers is an Apache2 licensed containers library, written in \
pure-Python, and fast as C-extensions. \
 \
Python's standard library is great until you need a sorted container type. Many \
will attest that you can get really far without one, but the moment you **really \
need** a sorted list, dict, or set, you're faced with a dozen different \
implementations, most using C-extensions without great documentation and \
benchmarking. \
 \
SortedContainers takes all of the work out of Python sorted types - making your \
deployment and use of Python easy. There's no need to install a C compiler or \
pre-build and distribute custom extensions. Performance is a feature and testing \
has 100% coverage with unit tests and hours of stress."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python310-sortedcontainers-2.4.0-2.1.noarch.rpm"
RPM_HASH = "e396b80a7150166dcb0066b4afe6574ac4f7a392656bd64c318ad0c574cd7d267d1b15b24f4b288a8f7f08a275256e487cd7be452b7ac4aa3d787fb6e44fdfd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sortedcontainers \
python3.10dist(sortedcontainers) \
python310-sortedcontainers \
python3dist(sortedcontainers)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
