SUMMARY = "Development documentation for Qwt(Qt6)"
DESCRIPTION = "This package contains the development documentation of the Qwt(Qt6) widgets \
as is it created by doxygen."
LICENSE = "SUSE-QWT-1.0"

PV = "6.2.0"

RPM_NAME = "qwt6-qt6-devel-doc-6.2.0-2.1.noarch.rpm"
RPM_HASH = "bda3a5f86d77b88347ddd11050ba33ac3a564d035a3395f3670b51c4701dc0e15efa068f530387b998d14590e1bc8179fb937839e8409c8a23d49edd2dd32c73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qwt6-qt6-devel-doc"
RDEPENDS:${PN} += "qwt6-qt6-devel"

inherit rpm
