SUMMARY = "Development files for libsubid4"
DESCRIPTION = "Development files for libsubid4."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.13"

RPM_NAME = "libsubid-devel-4.13-6.3.aarch64.rpm"
RPM_HASH = "9aa61d486b6806818657a511cef62857357dd167c1ddd519aabef10436d40c1ec140cc5f1ea40d6a8298a3a8034ae7ca131af30fc082b023787da3fb98857186"

RPROVIDES:${PN} += "libsubid-devel"

RDEPENDS:${PN} += "libsubid4"

inherit rpm
