SUMMARY = "Client for containerd"
DESCRIPTION = "Standalone client for containerd, which allows management of containerd containers \
separately from Docker."
LICENSE = "Apache-2.0"

PV = "1.6.20"

RPM_NAME = "containerd-ctr-1.6.20-1.1.aarch64.rpm"
RPM_HASH = "8f5b06c630cb9a742b4ebdcf9b9e2e77bfc12963c3780bd4b0c22f37d23643653ee23de58e0c7fdeb67fdb38ae39341f212afead1ba91db5d58dd75cb7d0a465"

RPROVIDES:${PN} += "containerd-ctr containerd-ctr(aarch-64)"
RDEPENDS:${PN} += "containerd libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
