SUMMARY = "A Tango-styled icon theme"
DESCRIPTION = "An original set of vector icons designed specifically for Elementary \
OS and its desktop environment, Pantheon."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.0"

RPM_NAME = "elementary-icon-theme-5.1.0-1.10.noarch.rpm"
RPM_HASH = "fe247ea224c90b1081d757e336962345ff3dfac8f59cc19ab181e95b9004bc6b50bf8cd81147a928eeb9b2fc877b2420750a95d26e13bcccac5b8f912d37a175"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elementary-icon-theme"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
