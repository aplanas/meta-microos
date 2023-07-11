SUMMARY = "Appendable key-value storage"
DESCRIPTION = "Key-value byte store with appendable values \
 \
Partd stores key-value pairs. \
Values are raw bytes. \
We append on old values. \
 \
Partd excels at shuffling operations."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python39-partd-1.3.0-1.5.noarch.rpm"
RPM_HASH = "0621abc484fdbc7229887ce1a9bed3755e5b9b04925f32196127411282687255e971e75283395e9a4644efc97682baa05c1f4431af54b0ad33933af91ff77e0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-partd \
python39-partd \
python3dist-partd"

RDEPENDS:${PN} += "python-abi \
python39-locket \
python39-toolz"

inherit rpm
