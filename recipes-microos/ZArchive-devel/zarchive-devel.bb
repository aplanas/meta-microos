SUMMARY = "Devel package for ZArchive"
DESCRIPTION = "This subpackage contains the devel files for ZArchive"
LICENSE = "MIT-0"

PV = "0.1.2+git20220908.d2c7177"

RPM_NAME = "ZArchive-devel-0.1.2+git20220908.d2c7177-2.1.aarch64.rpm"
RPM_HASH = "3bc63b8494f848ac114b4dc33f9c10338a451797e6f7bf24dfadfbb6a3ff6cc9eca79014ca6f3ab91468dd91eacb091e0b708f59609805f7bc0ad8aec7d267e4"

RPROVIDES:${PN} += "ZArchive-devel ZArchive-devel(aarch-64) pkgconfig(zarchive)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libzarchive0_1 pkgconfig(libzstd)"

inherit rpm
