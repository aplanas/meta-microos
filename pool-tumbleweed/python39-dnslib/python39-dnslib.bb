SUMMARY = "Simple library to encode/decode DNS wire-format packets"
DESCRIPTION = "Simple library to encode/decode DNS wire-format packets."
LICENSE = "BSD-2-Clause"

PV = "0.9.23"

RPM_NAME = "python39-dnslib-0.9.23-1.4.noarch.rpm"
RPM_HASH = "2bd47ae703ddd34874e2d4f4a225213586c318bfa486c5ee06dd7c7e5a8bcaf2dcf53b46bc5ffa79be7c1d46774856085f236320cd3c0dbe4c301d6199035b9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dnslib \
python39-dnslib \
python3dist-dnslib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
