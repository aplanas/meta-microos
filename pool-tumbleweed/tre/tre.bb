SUMMARY = "POSIX compatible regexp library with approximate matching"
DESCRIPTION = "TRE is a lightweight, robust, and efficient POSIX compatible regexp \
matching library with some exciting features such as approximate \
matching."
LICENSE = "BSD-3-Clause"

PV = "0.8.0_git201402282055"

RPM_NAME = "tre-0.8.0_git201402282055-7.2.aarch64.rpm"
RPM_HASH = "dfae61435bc7e9eb0f10c295a89468c3aa470228d4f17bed6e7ec3fa5456d15d6f72a3fdf9dc44bb108c5ba96645adb002ec630c778d5c88997cc7c3eb2e3a4f"

RPROVIDES:${PN} += "tre \
tre(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
