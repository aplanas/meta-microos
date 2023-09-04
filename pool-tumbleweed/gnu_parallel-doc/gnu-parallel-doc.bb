SUMMARY = "Documentation for GNU parallel"
DESCRIPTION = "GNU Parallel is a shell tool for executing jobs in parallel using one \
or more computers. \
This subpackage contains the documentation for Parallel."
LICENSE = "CC-BY-SA-3.0 & GFDL-1.3-only"

PV = "20230822"

RPM_NAME = "gnu_parallel-doc-20230822-1.1.noarch.rpm"
RPM_HASH = "48acf524f7399a3d0a9e16fff727d416aad3ae56ad9780d1f3d94504e0d5e237a83210c8cafbd2147e244806379fe8ed7e786d827ab5764277f14c91b0cf6668"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-parallel-doc"

RDEPENDS:${PN} += ""

inherit rpm
