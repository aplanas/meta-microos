SUMMARY = "Dependency package for imb_2021_3-gnu-mpich-hpc"
DESCRIPTION = "imb: Intel MPI Benchmarks (IMB) \
The package imb-gnu-mpich-hpc provides the dependency to get binary package imb_2021_3-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of imb_2021_3-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb-gnu-mpich-hpc-2021.3-1.2.noarch.rpm"
RPM_HASH = "38da280eba381977b257aaed8d18713ffa747e7a0995821a7bf513f4489e521f0f7ea14d69d6f36d2d7e83da102b2b3c08cf5aa9a4536960c20d229c0766712e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "imb-gnu-mpich-hpc"

RDEPENDS:${PN} += "/bin/sh \
imb-2021-3-gnu-mpich-hpc"

inherit rpm
