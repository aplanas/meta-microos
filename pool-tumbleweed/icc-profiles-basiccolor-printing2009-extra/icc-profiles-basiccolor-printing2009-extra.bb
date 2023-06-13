SUMMARY = "Collection of Cmyk Profiles from basICColor"
DESCRIPTION = "More printing profiles according to ISO 12647-2. This are all remaining \
CMYK ICC profiles for ISO Printing conditions from the 2009 set. \
The ISOcoated_v2_bas.ICC profile is packaged separately."
LICENSE = "Zlib"

PV = "1.2.0"

RPM_NAME = "icc-profiles-basiccolor-printing2009-extra-1.2.0-13.17.noarch.rpm"
RPM_HASH = "494b08f9ca2ccc70cd403f7b2cc67ef0979760852f0d784b7968b89af8f40722914667df056c7b0acc5136638a7aaa23dc46036fd5d360913f5c38a9274e4001"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icc-profiles-basiccolor-printing2009-extra"

RDEPENDS:${PN} += "icc-profiles-basiccolor-printing2009-coat2"

inherit rpm
