SUMMARY = "Utility scripts for saxon8"
DESCRIPTION = "Utility scripts for saxon8."
LICENSE = "MPL-1.1"

PV = "B.8.8"

RPM_NAME = "saxon8-scripts-B.8.8-133.7.noarch.rpm"
RPM_HASH = "7272b8438911118d36c87d1b21d6778fd830039e08019cadae4609e94277eaf6d7dc718c800f8618d632ca67db3b2986c8ba41de0a135863889e89e3ea9a5a40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon8-scripts"

RDEPENDS:${PN} += "saxon8"

inherit rpm
