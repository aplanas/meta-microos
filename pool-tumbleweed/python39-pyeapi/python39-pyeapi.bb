SUMMARY = "Python Client for eAPI"
DESCRIPTION = "The Python Client for eAPI (pyeapi) is a native Python library wrapper around \
Arista EOS eAPI.  It provides a set of Python language bindings for configuring \
Arista EOS nodes. \
 \
The Python library can be used to communicate with EOS either locally \
(on-box) or remotely (off-box). It uses a standard INI-style configuration file \
to specify one or more nodes and connection profiles. \
 \
The pyeapi library also provides an API layer for building native Python \
objects to interact with the destination nodes. The API layer is a convenient \
implementation for working with the EOS configuration and is extensible for \
developing custom implementations."
LICENSE = "BSD-3-Clause"

PV = "0.8.4"

RPM_NAME = "python39-pyeapi-0.8.4-3.8.noarch.rpm"
RPM_HASH = "bcd6970671423db61c9f892c13fc733feb29fc06c32dea3c947dee1b02b5442354194c2740c1f3c14901a4b21a2112cdbf69715882952cd24f2509e678c975c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyeapi \
python39-pyeapi \
python3dist-pyeapi"

RDEPENDS:${PN} += "python-abi \
python39-netaddr"

inherit rpm
