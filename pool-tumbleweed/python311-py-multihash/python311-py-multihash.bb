SUMMARY = "Multihash implementation in Python"
DESCRIPTION = "Multihash is a protocol for differentiating outputs from \
various well-established hash functions, addressing size \
and encoding considerations."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python311-py-multihash-2.0.1-1.9.noarch.rpm"
RPM_HASH = "f48bbef0a93697c8faa9d765d42eb9437a7d6e0cca465c3565cb6c2d67fcd2cc9e9fb0bbb492e5b9e829bc0a4ee731ecc0e5341150797baf762ac13bea6c7774"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(py-multihash) \
python311-py-multihash \
python3dist(py-multihash)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
