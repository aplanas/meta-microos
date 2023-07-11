SUMMARY = "Icinga Web 2 vendor library HTMLPurifier"
DESCRIPTION = "Icinga Web 2 vendor library HTMLPurifier."
LICENSE = "LGPL-2.1-only"

PV = "2.11.4"

RPM_NAME = "icingaweb2-vendor-HTMLPurifier-2.11.4-3.1.noarch.rpm"
RPM_HASH = "694e2166b6cb6037497b5aca839baf014c4088fddc1c76ec3f9ce8571cefa932101d306bb058f5eed6e108c4bf277233c36173344fa05d8ce6b1d2a8a58e2cfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-vendor-HTMLPurifier"

RDEPENDS:${PN} += "icingaweb2-common \
php"

inherit rpm
