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

RPM_NAME = "python310-sortedcontainers-2.4.0-2.3.noarch.rpm"
RPM_HASH = "0c48700eed348cd23d06686d16867ba2193438ded6fc6b47b006dd3c20f79a1371a3d040487ce2404b34b2e910085d08e67c3525e9d70315ff5eb1b6447d45de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sortedcontainers \
python310-sortedcontainers \
python3dist-sortedcontainers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
