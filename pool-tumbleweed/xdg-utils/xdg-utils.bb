SUMMARY = "Utilities to uniformly interface desktop environments"
DESCRIPTION = "The xdg-utils package is a set of simple scripts that provide basic \
desktop integration functions for any Free Desktop, such as Linux. \
 \
They are intended to provide a set of de-facto standards. \
This means that: \
 * Third party software developers can rely on these xdg-utils for \
   all of their simple integration needs. \
 \
*  Developers of desktop environments can make sure that their \
   environments are well supported. \
 \
   If a desktop developer wants to be certain that their \
   environment functions with all third party software, then can \
   simply make sure that these utilities work properly in their \
   environment."
LICENSE = "MIT"

PV = "1.1.3+20230830"

RPM_NAME = "xdg-utils-1.1.3+20230830-1.1.noarch.rpm"
RPM_HASH = "4d1f9b3f2bcb4be070e6a91e2d4e7be64b702fade5d2c403eddfa1e8f8612f4b3a46c5e8d242536127d0cfcd37db1f2d46f4ede7339f72079318b1b2919e2ea8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xdg-utils"

RDEPENDS:${PN} += "/usr/bin/sh \
perl \
perl-Net-DBus \
perl-X11-Protocol \
which"

inherit rpm
