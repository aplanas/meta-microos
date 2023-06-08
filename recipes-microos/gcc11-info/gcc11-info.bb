SUMMARY = "Documentation for the GNU compiler collection"
DESCRIPTION = "GNU info-pages for the GNU compiler collection covering both user-level \
and internals documentation."
LICENSE = "GFDL-1.2-only"

PV = "11.3.1+git2076"

RPM_NAME = "gcc11-info-11.3.1+git2076-2.3.noarch.rpm"
RPM_HASH = "516e6f5f309e0f75317187e363a113f3386159b63b753d678bd34ca0c51b5b45d6b4ba67d53260fde08d14c93c863bb4709d6ce6c2f0b22d6c2ea4135f97548d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcc11-info"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
