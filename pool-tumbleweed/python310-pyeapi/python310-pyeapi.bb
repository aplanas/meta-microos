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

RPM_NAME = "python310-pyeapi-0.8.4-3.8.noarch.rpm"
RPM_HASH = "506b405f26d57d77a65df251211e14c18926c0ff0cbfa842a016a0b61a050ba27a3b865f450953c9e4c7c58bf56a468db360042b83e230e720ddb3432ce716f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyeapi \
python310-pyeapi \
python3dist-pyeapi"

RDEPENDS:${PN} += "python-abi \
python310-netaddr"

inherit rpm
