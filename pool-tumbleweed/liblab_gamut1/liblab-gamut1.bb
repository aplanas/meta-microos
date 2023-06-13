SUMMARY = "Library containing a rich set of graph drawing tools"
DESCRIPTION = "The lab_gamut library contains a rich set of graph drawing tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "liblab_gamut1-2.49.3-6.3.aarch64.rpm"
RPM_HASH = "5211ec11bab2fe962cdfd7c4fa6a0e9728e09cb60e1eb06683cf71c433ae6f5f3ceba0696204ad648aba8ff3112d6e8ee92d21744f03be899b40dc3c39728ae7"

RPROVIDES:${PN} += "libgraphviz6:/usr/lib64/liblab_gamut.so.1 \
liblab_gamut.so.1()(64bit) \
liblab_gamut1 \
liblab_gamut1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
