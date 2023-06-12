SUMMARY = "Disk I/O Benchmark"
DESCRIPTION = "Benchmark script to measure disk I/O performance."
LICENSE = "ISC"

PV = "0.0+git.20200324"

RPM_NAME = "iops-0.0+git.20200324-1.7.noarch.rpm"
RPM_HASH = "fd18cf888be41633d14b7c7ab5631a07d3b23616c4714a159777895179d872dcb384d0551a836a12e2dc9954f5e3b01137807cc8ef5958c96991cbc074b6926d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iops"
RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
