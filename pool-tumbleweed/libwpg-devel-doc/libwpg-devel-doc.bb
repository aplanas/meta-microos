SUMMARY = "Documentation for the libwpg API"
DESCRIPTION = "This package contains documentation for the libwpg API."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.3.4"

RPM_NAME = "libwpg-devel-doc-0.3.4-2.2.noarch.rpm"
RPM_HASH = "3669bfce3e2c31fd2bacb1243a832b39f471ac728ecc020bed8a646fad2f9545a35a60293f8846a893df271183d18ebb1c7003d447b36ec5ea4ca7589f92300f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libwpg-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
