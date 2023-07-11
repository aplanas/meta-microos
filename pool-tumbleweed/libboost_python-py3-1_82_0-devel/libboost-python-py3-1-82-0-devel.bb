SUMMARY = "Development headers for Boost.Python library"
DESCRIPTION = "Development headers for Boost.Python library. This package contains \
library for python3 development for boost."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_python-py3-1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "e8cdd8278dc5ed75a92f8e34e5f7b8178f486487bc0d6058922ade83548e816e001ea9b0d9ad7a9e93fe01ff8d5af251c5769bb81c3e27402754751fb09ddb60"

RPROVIDES:${PN} += "libboost-python-py3-1-82-0-devel \
libboost-python3-devel-impl"

RDEPENDS:${PN} += "libboost-headers1-82-0-devel \
libboost-python-py3-1-82-0"

inherit rpm
