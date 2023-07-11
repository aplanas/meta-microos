SUMMARY = "Development files for range-v3"
DESCRIPTION = "Development files for range-v3."
LICENSE = "BSL-1.0"

PV = "0.12.0"

RPM_NAME = "range-v3-devel-0.12.0-1.4.aarch64.rpm"
RPM_HASH = "ab2224b16b2291f3ceb92e33f113522ad0eddd588cba9f4450a7dd66f605582a3a4811d073af5a9c407877ad417c9535f2412d808a0a7c79d5d6388fc762cc6c"

RPROVIDES:${PN} += "cmake-range-v3 \
range-v3-devel \
range-v3-static"

RDEPENDS:${PN} += ""

inherit rpm
