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

RPM_NAME = "python311-pyeapi-0.8.4-3.8.noarch.rpm"
RPM_HASH = "af5fbee5b0d346f5ab37b843c9bbaea528d0058a349a2562e8a9206db1f8b4933f7cacfe6402f5bcb60b31230c9fd461d472ec23d28c958a399c11ca32e9df0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyeapi \
python3.11dist-pyeapi \
python311-pyeapi \
python3dist-pyeapi"

RDEPENDS:${PN} += "python-abi \
python311-netaddr"

inherit rpm
