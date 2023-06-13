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

RPM_NAME = "python311-pyeapi-0.8.4-3.6.noarch.rpm"
RPM_HASH = "4b9ee456c980bb9f2c98b4fbe3ef1461679242e1b1a3c55f86790cc9bf331a2ad5153a87317a4313fd23e7b3dfc2804df5e8699bb4ba667781bed88c971c139e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyeapi) \
python311-pyeapi \
python3dist(pyeapi)"

RDEPENDS:${PN} += "python(abi) \
python311-netaddr"

inherit rpm
