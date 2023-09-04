SUMMARY = "A process utilities module for Python"
DESCRIPTION = "A graphical interface that lets you easily analyze and introspect unaltered running Python processes."
LICENSE = "BSD-3-Clause"

PV = "5.9.5"

RPM_NAME = "python311-psutil-5.9.5-2.1.aarch64.rpm"
RPM_HASH = "27ac4d442fb5e30a28208ec96096d3462707db73e09aaf43f96000d37000db2249d0feb2affe97711ebfcc8b9c887d157b1f48108135bdd541637f07b222112e"

RPROVIDES:${PN} += "python3-psutil \
python3.11dist-psutil \
python311-psutil \
python3dist-psutil"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
procps \
python-abi"

inherit rpm
