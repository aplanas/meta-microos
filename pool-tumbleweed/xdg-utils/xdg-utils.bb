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

PV = "1.1.3+20210805"

RPM_NAME = "xdg-utils-1.1.3+20210805-2.3.noarch.rpm"
RPM_HASH = "933af97ffaafea17b97bff35983061af341363efac74ce6c478f948fdd7085467e7068760e35513a84f2d2142f14f366dfddccbb8c80268854a9dcab7b8c185f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xdg-utils"

RDEPENDS:${PN} += "/usr/bin/sh \
perl \
perl-Net-DBus \
perl-X11-Protocol \
which"

inherit rpm
