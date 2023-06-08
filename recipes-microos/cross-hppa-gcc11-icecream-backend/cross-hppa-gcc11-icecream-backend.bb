SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-hppa-gcc11-icecream-backend-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "db8662fdc8eed2e0f6ddeb568ffd80ba74d77d9fdb48d15589236d9d4393b6eb999a5458297695ead38cf2229f412be9acc3248516507c4426e32f3e61d68350"

RPROVIDES:${PN} += "cross-hppa-gcc11-icecream-backend cross-hppa-gcc11-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
