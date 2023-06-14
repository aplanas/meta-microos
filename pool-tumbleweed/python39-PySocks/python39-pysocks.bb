SUMMARY = "A Python SOCKS client module"
DESCRIPTION = "A Python SOCKS client module. \
 \
It is an actively maintained SocksiPy fork. Contains many \
improvements to the original. \
 \
See https://github.com/Anorov/PySocks for more information."
LICENSE = "BSD-3-Clause"

PV = "1.7.1"

RPM_NAME = "python39-PySocks-1.7.1-2.1.noarch.rpm"
RPM_HASH = "9b5bc51111059944102ff2214ababc3b062631cdfaf616bde9318b94c71ea239e4917628933c84759d63a31825cec9d423a9654a552c020422be7f33535bc802"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pysocks \
python39-PySocks \
python3dist-pysocks"

RDEPENDS:${PN} += "python-abi"

inherit rpm
