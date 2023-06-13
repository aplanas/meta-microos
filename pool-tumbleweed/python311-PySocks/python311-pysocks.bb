SUMMARY = "A Python SOCKS client module"
DESCRIPTION = "A Python SOCKS client module. \
 \
It is an actively maintained SocksiPy fork. Contains many \
improvements to the original. \
 \
See https://github.com/Anorov/PySocks for more information."
LICENSE = "BSD-3-Clause"

PV = "1.7.1"

RPM_NAME = "python311-PySocks-1.7.1-2.1.noarch.rpm"
RPM_HASH = "96c2b0b1e4bc06b8d3000a6755c9de8fc052c9007fa3e643c54ccd0f6c4b9ce6bd2b9c421013f8c029e3192c4fbe8c787208d45d760a7205ec0974042840f4ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pysocks) \
python311-PySocks \
python3dist(pysocks)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
