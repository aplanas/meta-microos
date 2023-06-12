SUMMARY = "Development headers for Boost.Regex library"
DESCRIPTION = "This package contains development headers for Boost.Regex library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_regex-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "42db8f1a97804ff5f4dce6dca0edbfe71dd2e81e1f9450ef28b65c5a9c84f0e3cedfc1e59b265477b7834d2717f803b5e2097f8ada1d0feb6c18bd4574aa8bf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost_regex-devel"
RDEPENDS:${PN} += "libboost_regex1_82_0-devel"

inherit rpm
