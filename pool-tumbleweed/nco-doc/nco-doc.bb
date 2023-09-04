SUMMARY = "Documentation for nco"
DESCRIPTION = "The netCDF Operators, NCO, are a suite of command line programs to \
facilitate manipulation and analysis of self-describing data stored \
in the netCDF and HDF formats. \
 \
This package contains the documentation for nco."
LICENSE = "BSD-3-Clause"

PV = "5.1.7"

RPM_NAME = "nco-doc-5.1.7-1.1.noarch.rpm"
RPM_HASH = "515b13e0b0ca4a6bc62395e9f0c5d8273f2d0da30f3e7b8d33dc240ee18d7feb6d55d39bb4c294fadb6ca811cf87c26d3459aee558af440637cd65c7dbb192c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nco-doc"

RDEPENDS:${PN} += ""

inherit rpm
