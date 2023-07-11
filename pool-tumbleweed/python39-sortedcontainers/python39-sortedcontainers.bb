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

RPM_NAME = "python39-sortedcontainers-2.4.0-2.3.noarch.rpm"
RPM_HASH = "60bb39924ca45e1a6584102b10f20872945958ff5a5c4263b3ea142561e05f7e61e0e966d0a75b20a0b408cd8d346c5c016664a14d0bcaa6f4d2f336dd2b11a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sortedcontainers \
python39-sortedcontainers \
python3dist-sortedcontainers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
