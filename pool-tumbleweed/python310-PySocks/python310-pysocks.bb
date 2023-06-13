SUMMARY = "A Python SOCKS client module"
DESCRIPTION = "A Python SOCKS client module. \
 \
It is an actively maintained SocksiPy fork. Contains many \
improvements to the original. \
 \
See https://github.com/Anorov/PySocks for more information."
LICENSE = "BSD-3-Clause"

PV = "1.7.1"

RPM_NAME = "python310-PySocks-1.7.1-2.1.noarch.rpm"
RPM_HASH = "773b5c325b08281884579a411d958856dfed4f8ee6d82f35185b3fa940e044403b91eb5454f62f215a056ab5aef77dba16fc5d4f435622bfe6d29a062feaae7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PySocks \
python3.10dist(pysocks) \
python310-PySocks \
python3dist(pysocks)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
