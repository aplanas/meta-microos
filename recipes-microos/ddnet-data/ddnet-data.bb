SUMMARY = "Data files for ddnet"
DESCRIPTION = "Data files for DDraceNetwork (DDNet)."
LICENSE = "Apache-2.0 & CC-BY-SA-3.0 & Zlib & MIT & SUSE-Public-Domain"

PV = "16.9"

RPM_NAME = "ddnet-data-16.9-1.1.noarch.rpm"
RPM_HASH = "b6c2e5879c817bb367b94b89cf3ffde0b5c2fa8527f2e1fad2c2711dedcf017aac029b95fcc6d9d8c23f9b406260a9d02e3c58c08a2efef3de0dec1b46baee66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ddnet-data"
RDEPENDS:${PN} += "ddnet"

inherit rpm
