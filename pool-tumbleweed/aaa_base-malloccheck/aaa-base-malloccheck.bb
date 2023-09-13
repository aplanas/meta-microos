SUMMARY = "SUSE Linux Base Package (malloc checking)"
DESCRIPTION = "This package sets environment variables that enable stricter \
malloc checks to catch potential heap corruptions. It's not \
installed by default as it may degrade performance."
LICENSE = "GPL-2.0-or-later"

PV = "84.87+git20230815.cab7b44"

RPM_NAME = "aaa_base-malloccheck-84.87+git20230815.cab7b44-1.1.aarch64.rpm"
RPM_HASH = "29647bc57a6e30fc0341332442497157f88bb4d86e26bd66a1c2972522bdc07f7249b9587b6640b0e8724b4cd5cbb36945a5856e8ca7e6c1d1427afb54c57603"

RPROVIDES:${PN} += "aaa-base-malloccheck"

RDEPENDS:${PN} += "aaa-base"

inherit rpm
