SUMMARY = "Development files for range-v3"
DESCRIPTION = "Development files for range-v3."
LICENSE = "BSL-1.0"

PV = "0.12.0"

RPM_NAME = "range-v3-devel-0.12.0-1.3.aarch64.rpm"
RPM_HASH = "5b29b9c702adbda3f7c6041bb50ad42fb9c4580088d05b1e05b6990829e9646ccf380f9452d94709487e39b661687a1aad8fee4cab69b5259a672bbfba1fa63f"

RPROVIDES:${PN} += "cmake-range-v3 \
range-v3-devel \
range-v3-static"

RDEPENDS:${PN} += ""

inherit rpm
