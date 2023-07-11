SUMMARY = "Dependency package for mumps_5_3_5-gnu-mvapich2-hpc-doc"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-mvapich2-hpc-doc provides the dependency to get binary package mumps_5_3_5-gnu-mvapich2-hpc-doc. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-mvapich2-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-mvapich2-hpc-doc-5.3.5-3.4.noarch.rpm"
RPM_HASH = "29ff92ddb2b05199f3e44fd937957787d2e434e042d6ce42e39e480e9033743b78a91ea5e5ff80c4677e433febfcc758d71be40d920bc1020f264a2c60dcf9df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-mvapich2-hpc-doc"

RDEPENDS:${PN} += "mumps-5-3-5-gnu-mvapich2-hpc-doc"

inherit rpm
