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

RPM_NAME = "python311-partd-1.3.0-1.5.noarch.rpm"
RPM_HASH = "dfffb07c841ee75e776bdb71eb15173e2025d7eb6cd9c3b108d87e193585aeb958f4d10fb2207ac8769827f73c8a399e37c4d0027ab66d31a771f858284ee9d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-partd \
python3.11dist-partd \
python311-partd \
python3dist-partd"

RDEPENDS:${PN} += "python-abi \
python311-locket \
python311-toolz"

inherit rpm
