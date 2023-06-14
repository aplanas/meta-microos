SUMMARY = "SUSE Linux Base Package (malloc checking)"
DESCRIPTION = "This package sets environment variables that enable stricter \
malloc checks to catch potential heap corruptions. It's not \
installed by default as it may degrade performance."
LICENSE = "GPL-2.0-or-later"

PV = "84.87+git20230329.b39efbc"

RPM_NAME = "aaa_base-malloccheck-84.87+git20230329.b39efbc-1.1.aarch64.rpm"
RPM_HASH = "eb2873ab1dde911db7ee78e830b4d03535fedaa0c591adf3a07d75bad725f52b4a08d1bc9d6a1c659f62341cceba498aab0ccf5119bc7992fd0efc873ea834a8"

RPROVIDES:${PN} += "aaa-base-malloccheck"

RDEPENDS:${PN} += "aaa-base"

inherit rpm
