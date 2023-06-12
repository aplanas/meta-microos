SUMMARY = "Development files for debugbreak"
DESCRIPTION = "This package contains the header file needed to use debug_break."
LICENSE = "BSD-2-Clause"

PV = "1.0~git.20210702"

RPM_NAME = "debugbreak-devel-1.0~git.20210702-1.2.noarch.rpm"
RPM_HASH = "2d7d501e29b3704be3672eb579b7722ed43fb75998f6586ea86e610c69b6dbf1a94727499a6a17305c505a982cf5770cf1a5a9e55c3bdc1d726dad90e31bb2cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "debugbreak-devel"
RDEPENDS:${PN} += "debugbreak"

inherit rpm
