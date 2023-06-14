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

RPM_NAME = "python310-partd-1.3.0-1.3.noarch.rpm"
RPM_HASH = "ba2dc82465c5e9fd1503ef5e041a3b049b5c1a0515ae0c6cee97af073a0bc58121c66a7d643805cec858f85621ecb86358b197a6296247d1feb9cf12ab65bf62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-partd \
python3.10dist-partd \
python310-partd \
python3dist-partd"

RDEPENDS:${PN} += "python-abi \
python310-locket \
python310-toolz"

inherit rpm
