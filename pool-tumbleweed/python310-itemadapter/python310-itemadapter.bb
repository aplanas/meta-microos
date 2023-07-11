SUMMARY = "Wrapper for data container objects"
DESCRIPTION = "The ItemAdapter class is a wrapper for data container objects, providing \
a common interface to handle objects of different types in an uniform \
manner, regardless of their underlying implementation."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python310-itemadapter-0.7.0-1.4.aarch64.rpm"
RPM_HASH = "4916c43126e0a0a193a98bca02bde5c188379e53eb44114bd6f2ca0d3b808b67823c65c6a9353bac1130fdeae042b87044aaddeeb57c8533d549d79f274f4b25"

RPROVIDES:${PN} += "python3.10dist-itemadapter \
python310-itemadapter \
python3dist-itemadapter"

RDEPENDS:${PN} += "python-abi"

inherit rpm
