SUMMARY = "Library to parse Passbook files"
DESCRIPTION = "kpkpass is a library to read and parse Apple Passbook files, such as the ones \
commonly used for hotel and flight reservations."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kpkpass-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "8d824ff7d275bc93a89902dc86781f8673ecc375cd14af0c6a23020bce2faaa8326d1803c135fa65c5f24e02b28754362e6ffab759efa85ae42fcbc49d82c311"

RPROVIDES:${PN} += "kpkpass"

RDEPENDS:${PN} += ""

inherit rpm
