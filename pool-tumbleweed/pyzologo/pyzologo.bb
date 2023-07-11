SUMMARY = "Icons for Pyzo"
DESCRIPTION = "Icons used by pyzo"
LICENSE = "BSD-3-Clause"

PV = "4.11.2"

RPM_NAME = "pyzologo-4.11.2-1.14.noarch.rpm"
RPM_HASH = "eeaddcb380452117b70cb1de5527fc3b1d43eaa2818d9164e264e6177b1a329429d66ab2c961a600400b9e5f290c494bdb1a53c220180e63591e8c3cb3904171"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyzologo"

RDEPENDS:${PN} += ""

inherit rpm
