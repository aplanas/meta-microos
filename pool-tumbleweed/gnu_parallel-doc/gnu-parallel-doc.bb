SUMMARY = "Documentation for GNU parallel"
DESCRIPTION = "GNU Parallel is a shell tool for executing jobs in parallel using one \
or more computers. \
This subpackage contains the documentation for Parallel."
LICENSE = "CC-BY-SA-3.0 & GFDL-1.3-only"

PV = "20230422"

RPM_NAME = "gnu_parallel-doc-20230422-1.1.noarch.rpm"
RPM_HASH = "89398408d5c9df0abaec2af3d757efafcb20b711b6c155e43ea0773060c770bfbb473522fbac9a0880547dc0b344309362384eb6bf469bc69e8c3fcac45a978d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu_parallel-doc"
RDEPENDS:${PN} += ""

inherit rpm
