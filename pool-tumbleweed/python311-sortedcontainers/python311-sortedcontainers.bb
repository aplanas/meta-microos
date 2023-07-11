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

RPM_NAME = "python311-sortedcontainers-2.4.0-2.3.noarch.rpm"
RPM_HASH = "d676a292c05c310f540f898d8d23a354dfb84550939db41355ba29bf2c26453ed789c87556868ae38139ee9d6a819d139dbb051a3bbe27239437acb0515dd884"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sortedcontainers \
python3.11dist-sortedcontainers \
python311-sortedcontainers \
python3dist-sortedcontainers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
