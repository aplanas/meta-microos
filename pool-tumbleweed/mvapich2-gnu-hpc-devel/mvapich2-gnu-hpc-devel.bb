SUMMARY = "Dependency package for mvapich2_2_3_7-gnu-hpc-devel"
DESCRIPTION = "mvapich2: OSU MVAPICH2 MPI package \
The package mvapich2-gnu-hpc-devel provides the dependency to get binary package mvapich2_2_3_7-gnu-hpc-devel. \
When this package gets updated it installs the latest version of mvapich2_2_3_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-gnu-hpc-devel-2.3.7-5.1.aarch64.rpm"
RPM_HASH = "5388dd1cfee3501b849b36c8c42f6abe133e72b73727f9e0741a6e60ff7f99a400c6317c82bf3606a31e5a85a5a215f12ad5746af1ed1b02f6b287fd0b12b12f"

RPROVIDES:${PN} += "mvapich2-gnu-hpc-devel"

RDEPENDS:${PN} += "mvapich2-2-3-7-gnu-hpc-devel"

inherit rpm
