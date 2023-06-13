SUMMARY = "Headers and development files"
DESCRIPTION = "genders headers and libraries files needed for development"
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "genders-devel-1.28.1-2.3.aarch64.rpm"
RPM_HASH = "fb0a53eea718d200bc2637c7d9207f0e346e5d2d69b032dd5c275ba9dcd02e3650ba9a2884a3474da03feaabff8e948083288077cdf9171409e08ee2be962c74"

RPROVIDES:${PN} += "genders-devel \
genders-devel(aarch-64)"

RDEPENDS:${PN} += "genders"

inherit rpm
