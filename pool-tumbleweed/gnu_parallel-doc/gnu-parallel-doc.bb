SUMMARY = "Documentation for GNU parallel"
DESCRIPTION = "GNU Parallel is a shell tool for executing jobs in parallel using one \
or more computers. \
This subpackage contains the documentation for Parallel."
LICENSE = "CC-BY-SA-3.0 & GFDL-1.3-only"

PV = "20230722"

RPM_NAME = "gnu_parallel-doc-20230722-1.1.noarch.rpm"
RPM_HASH = "325b01ab56c6dac69d0f1d33e21927737020fba1cdc48097c653cdf2ae0544cd25161ae6e6493fbc2e65e0628317427ff19d6ee582884da00067231bd1b25ba6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-parallel-doc"

RDEPENDS:${PN} += ""

inherit rpm
