SUMMARY = "Oxygen Icon Theme"
DESCRIPTION = "This package contains the non-scalable icons of the Oxygen icon theme."
LICENSE = "LGPL-3.0-only"

PV = "5.109.0"

RPM_NAME = "oxygen5-icon-theme-5.109.0-1.1.noarch.rpm"
RPM_HASH = "ba1c0cf8296e6e0ab626c50c2a5f359882ffbb0ee45ac544166d6c457e5f312122b47825ba3c8a2028de92ba7991f6867e857877a1d7365fe0135a05c288b13e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oxygen-icon-theme \
oxygen5-icon-theme"

RDEPENDS:${PN} += "hicolor-icon-theme"

inherit rpm
