SUMMARY = "RPM macros used to setup apparmor profiles"
DESCRIPTION = "Package that provides RPM macros used to setup apparmor profiles for packaging."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0"

RPM_NAME = "apparmor-rpm-macros-1.0-6.10.noarch.rpm"
RPM_HASH = "ac75d84ddcef610012086724f437d41c2c67a945aaa50b59ecbb8c2a42970c6c50e71f4a5ccf96d096d6fea201b238352ff402aa818e98577d7845b9ff33135c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-rpm-macros \
rpm_macro(apparmor_reload)"

RDEPENDS:${PN} += "coreutils"

inherit rpm
