SUMMARY = "Development files for Allegro's logg"
DESCRIPTION = "This package is needed to build programs that use Allegro's logg."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "liblogg44-devel-4.4.3.1-1.16.aarch64.rpm"
RPM_HASH = "d4d90ac00f1944c61cbc1066e97679c155ccd04cdb04fb03c105eb0eb2c2732c3883b25ec79dfa844eca8f7fdafc3a8313866b5c3f4e4c7116e89d221fb7b4f7"

RPROVIDES:${PN} += "liblogg-devel \
liblogg44-devel \
pkgconfig-logg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblogg4-4 \
pkgconfig-allegro"

inherit rpm
