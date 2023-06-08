SUMMARY = "Compute Library sample data"
DESCRIPTION = "Free *.npy and *.ppm files to use with example binaries."
LICENSE = "MIT"

PV = "23.02"

RPM_NAME = "ComputeLibrary-sample-data-23.02-2.1.aarch64.rpm"
RPM_HASH = "48442348c19b08f5bf569667d2a376d104069543299af9fabc0c786f66635bd78de6512cd73a0a7cc7f7bb2a44b82cd0786218850a3bdd28c67949212e437f81"

RPROVIDES:${PN} += "ComputeLibrary-sample-data ComputeLibrary-sample-data(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
