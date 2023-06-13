SUMMARY = "Development files for the Open Path Guiding library"
DESCRIPTION = "Development files for the Open Path Guiding library."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "openpgl-devel-0.4.1-1.3.aarch64.rpm"
RPM_HASH = "f66321cfbd5f390cef09bf30e8cc39f92ebfc0558a7f6320349122addd48d9242cc8de6a7fd3026890102a29de9bc07c2eacca472c91c3e571ebf960de8bc258"

RPROVIDES:${PN} += "cmake(openpgl) \
openpgl-devel \
openpgl-devel(aarch-64)"

RDEPENDS:${PN} += "libopenpgl0"

inherit rpm
