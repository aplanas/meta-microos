SUMMARY = "OMEMO Encryption Library"
DESCRIPTION = "Python library for handling OMEMO encryption."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "python39-omemo-dr-1.0.0-1.2.aarch64.rpm"
RPM_HASH = "ddea4fec1ec2705755064df6db4f6e3637d0c696b6624b7fc9749faec6125086fd1a72d2627ad1fe1cd6734bfd6189486bf52aef455ee0f00bf39abef281ae94"

RPROVIDES:${PN} += "python3.9dist-omemo-dr \
python39-omemo-dr \
python3dist-omemo-dr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python3.9dist-cryptography \
python3.9dist-protobuf \
python39-cryptography \
python39-protobuf"

inherit rpm
