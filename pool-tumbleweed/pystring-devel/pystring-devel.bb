SUMMARY = "Development files for pystring"
DESCRIPTION = "Development files for pystring."
LICENSE = "BSD-2-Clause"

PV = "1.1.3"

RPM_NAME = "pystring-devel-1.1.3-1.9.aarch64.rpm"
RPM_HASH = "57416b42613305b50fd8461de2520ca28a8b803338256e4f56402716726a4652dc37cfe73f7c12db927f06ad2db899821d1ad7f4d422d706644a06cdcfcdf93f"

RPROVIDES:${PN} += "pystring-devel"

RDEPENDS:${PN} += "libpystring0-0"

inherit rpm
