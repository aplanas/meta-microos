SUMMARY = "Data files for ddnet"
DESCRIPTION = "Data files for DDraceNetwork (DDNet)."
LICENSE = "Apache-2.0 & CC-BY-SA-3.0 & Zlib & MIT & SUSE-Public-Domain"

PV = "17.2"

RPM_NAME = "ddnet-data-17.2-1.1.noarch.rpm"
RPM_HASH = "abf2588e823aa2e3408d954f0fcaf961b8f0507102631827b69cd57b4bf1a915a103941e99a446379db72ddd9dce0a9b0c21c92178c29c828460d59d5c4ea9f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ddnet-data"

RDEPENDS:${PN} += "ddnet"

inherit rpm
