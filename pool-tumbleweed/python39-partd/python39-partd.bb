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

RPM_NAME = "python39-partd-1.3.0-1.3.noarch.rpm"
RPM_HASH = "db6dcacea99b9720d016d4278a7d497ebdb472aa91fc36f6041a8bfc516f2196c43afa302f2a32d8554ec1f4a9f7f8f0f9fd2286492734477261d1f8f882a597"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(partd) \
python39-partd \
python3dist(partd)"

RDEPENDS:${PN} += "python(abi) \
python39-locket \
python39-toolz"

inherit rpm
