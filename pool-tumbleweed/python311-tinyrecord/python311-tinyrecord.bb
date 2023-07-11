SUMMARY = "Atomic transactions for TinyDB"
DESCRIPTION = "Atomic transactions for TinyDB."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-tinyrecord-0.2.0-2.9.noarch.rpm"
RPM_HASH = "6a5c74d367a3540b299b69fc1f73b1d568b8f07903ea70398678046dbad86941300ea71a8b569c6d0944927da63675b7ae9c272e0081e01c04a5920cfba0c228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tinyrecord \
python3.11dist-tinyrecord \
python311-tinyrecord \
python3dist-tinyrecord"

RDEPENDS:${PN} += "python-abi \
python311-tinydb"

inherit rpm
