SUMMARY = "Development files for libmaa"
DESCRIPTION = "This RPM contains the development files for libmaa."
LICENSE = "MIT"

PV = "1.4.7"

RPM_NAME = "libmaa-devel-1.4.7-1.12.aarch64.rpm"
RPM_HASH = "29cdaa01e687e731d4a26badedb3f22f8100f9af73074c0e1b590b4cef9cbe88be30adaafcd8ac9705ff304eb8235d3223b79106a8d1586afdd78e98cf838b4f"

RPROVIDES:${PN} += "libmaa-devel \
libmaa-devel(aarch-64)"
RDEPENDS:${PN} += "libmaa4"

inherit rpm
