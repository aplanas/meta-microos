SUMMARY = "Development files for the hhdate library"
DESCRIPTION = "A date and time library based on the C++11/14/17 chrono header."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "hhdate-devel-3.0.1-3.3.aarch64.rpm"
RPM_HASH = "9413919b96b5c396607b2278b02b0834dbaa332b8af0f93a077f8e4dc0a20233785ffd084cde255db6d307a09f8fa09e33ea75ae324d13fd3b08dc280d58c437"

RPROVIDES:${PN} += "cmake-date \
hhdate-devel"

RDEPENDS:${PN} += "libdate-tz3"

inherit rpm
