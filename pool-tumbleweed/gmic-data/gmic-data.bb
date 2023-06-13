SUMMARY = "Shared data files for the various gmic frontends"
DESCRIPTION = "This package contains shared data files for the various gmic frontends."
LICENSE = "CECILL-2.1"

PV = "3.2.5"

RPM_NAME = "gmic-data-3.2.5-1.1.noarch.rpm"
RPM_HASH = "50ef448e49877846c0dcca6a8492dd61654f673048bcb681da0aa4d6b7c56f87270392d5f8b92f97a6f4a07e77188975a6179f138f666668ed8fd77f2e2b13d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gmic-data"

RDEPENDS:${PN} += ""

inherit rpm
