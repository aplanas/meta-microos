SUMMARY = "Haskell dbus library documentation"
DESCRIPTION = "This package provides the Haskell dbus library documentation."
LICENSE = "Apache-2.0"

PV = "1.2.29"

RPM_NAME = "ghc-dbus-doc-1.2.29-1.8.noarch.rpm"
RPM_HASH = "1f22fd7c7d70b1e5086ea889420f32eea2a7b19a695324211ea38a79b1e5567530af2b9cacd663f6acba38c4f80b4236ea03b6af0ee78887adb65db388639798"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-dbus-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
