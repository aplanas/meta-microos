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

RPM_NAME = "xdg-utils-1.1.3+20210805-2.2.noarch.rpm"
RPM_HASH = "8d0443bddeaabd6ce4d5c8f07cca0dbf5af3ee1118e2facbdbe398f9d78eb2a48e4635a34b04e235d039bd4a9042e3e9d785b7b070f0da18b5191480fc591b07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xdg-utils"

RDEPENDS:${PN} += "/bin/sh \
perl \
perl-Net-DBus \
perl-X11-Protocol \
which"

inherit rpm
