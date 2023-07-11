SUMMARY = "Data files for ddnet"
DESCRIPTION = "Data files for DDraceNetwork (DDNet)."
LICENSE = "Apache-2.0 & CC-BY-SA-3.0 & Zlib & MIT & SUSE-Public-Domain"

PV = "16.9"

RPM_NAME = "ddnet-data-16.9-1.3.noarch.rpm"
RPM_HASH = "5e1b08eecbada639c0b35e9b54fabbdf252b04bdf56800a967a8b65406978a9d203e55da0d2be0c08475e4fe99892824d08f457229ec099104f5a24c33a5ea69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ddnet-data"

RDEPENDS:${PN} += "ddnet"

inherit rpm
