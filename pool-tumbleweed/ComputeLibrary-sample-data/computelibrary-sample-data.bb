SUMMARY = "Compute Library sample data"
DESCRIPTION = "Free *.npy and *.ppm files to use with example binaries."
LICENSE = "MIT"

PV = "23.08"

RPM_NAME = "ComputeLibrary-sample-data-23.08-1.1.aarch64.rpm"
RPM_HASH = "4b35f66d72f1d4770caf70964170b1f36a2e38643243eb909306bcc378806e425bb0f89ce5257259b68925f7ba7ae0bd82492daae47cdc76efcad6b3dfb04f51"

RPROVIDES:${PN} += "ComputeLibrary-sample-data"

RDEPENDS:${PN} += ""

inherit rpm
