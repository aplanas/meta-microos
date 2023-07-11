SUMMARY = "Botan python bindings"
DESCRIPTION = "This package contains the python bindings to libbotan's C98 interface."
LICENSE = "BSD-2-Clause"

PV = "2.19.3"

RPM_NAME = "python3-botan-2.19.3-1.6.aarch64.rpm"
RPM_HASH = "3cde62bc33a8384c12254328290127c02edc0fc1a67f8564efbacb8755d13b6d8ff7da3f65c1d5b85e736c47d6a84530ecd47e0c656b4f5530b895bbd1860607"

RPROVIDES:${PN} += "python3-botan"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3"

inherit rpm
