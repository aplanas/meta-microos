SUMMARY = "Development files for Allegro's loadpng"
DESCRIPTION = "This package is needed to build programs that use Allegro's loadpng."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "libloadpng44-devel-4.4.3.1-1.15.aarch64.rpm"
RPM_HASH = "240250da62d599a6bf1fc1f63c97375436812130f5b6fcbf89afa00d10edf1b3f4a27fd40b9459e5b2cdba5d13537fc5650a57225be37aeaa4429bfc888b2f65"

RPROVIDES:${PN} += "libloadpng-devel \
libloadpng44-devel \
pkgconfig-loadpng"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libloadpng4-4 \
pkgconfig-allegro"

inherit rpm
