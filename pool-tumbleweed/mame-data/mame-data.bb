SUMMARY = "Data files required by all builds of MAME"
DESCRIPTION = "This package contains all data files needed by the MAME binaries: \
 * shaders \
 * artwork \
 * rom hashes \
 * languages"
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.254"

RPM_NAME = "mame-data-0.254-1.2.noarch.rpm"
RPM_HASH = "10fafd4afecee4f0ce84595b7ef2bb7cab9c03a037f2c9a6ad2c6e105735b6b864c2d69a00e3bcc894ab3826eb38aaead6d9f6a7a8c0762e54b58cd4b7345d85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mame-data"

RDEPENDS:${PN} += ""

inherit rpm
