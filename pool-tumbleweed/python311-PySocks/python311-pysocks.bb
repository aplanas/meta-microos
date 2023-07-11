SUMMARY = "A Python SOCKS client module"
DESCRIPTION = "A Python SOCKS client module. \
 \
It is an actively maintained SocksiPy fork. Contains many \
improvements to the original. \
 \
See https://github.com/Anorov/PySocks for more information."
LICENSE = "BSD-3-Clause"

PV = "1.7.1"

RPM_NAME = "python311-PySocks-1.7.1-2.2.noarch.rpm"
RPM_HASH = "43924becf4b9b1795a5a426ccd10cb28e2bee1e66ae5c09a5d14cdef2b91cfbd7648736417372aed7b771ab6cd0c87ae6ed706fea71acc4c24239ebc5004c3c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PySocks \
python3.11dist-pysocks \
python311-PySocks \
python3dist-pysocks"

RDEPENDS:${PN} += "python-abi"

inherit rpm
