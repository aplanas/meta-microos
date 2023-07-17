SUMMARY = "Hex Editor data files"
DESCRIPTION = "Data files used by Okteta/libKasten, e.g. structures definitions."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.12"

RPM_NAME = "okteta-data-0.26.12-1.1.noarch.rpm"
RPM_HASH = "3c7c8a4c806bd99723d8644e73788268ffc180dd575849126f5b95bc8755f74ccbea38efb5f03f5729e965529f46d21f385fe1dd4f39be95c9c082cbac6da9ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "okteta-data"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
