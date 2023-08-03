SUMMARY = "Data files for ddnet"
DESCRIPTION = "Data files for DDraceNetwork (DDNet)."
LICENSE = "Apache-2.0 & CC-BY-SA-3.0 & Zlib & MIT & SUSE-Public-Domain"

PV = "17.1.1"

RPM_NAME = "ddnet-data-17.1.1-1.1.noarch.rpm"
RPM_HASH = "28a50443d6ae22b5413869b383307e118907f36128f560a69a29ea510ab407a310d2065ce56bcd953248e06139f810ebbca7e661bc217d230be9f143ffd62ae8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ddnet-data"

RDEPENDS:${PN} += "ddnet"

inherit rpm
