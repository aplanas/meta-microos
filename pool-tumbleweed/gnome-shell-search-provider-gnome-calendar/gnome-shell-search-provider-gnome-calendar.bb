SUMMARY = "GNOME Shell search provider to return results from the GNOME Calendar"
DESCRIPTION = "This package contains a search provider to enable GNOME Shell to get \
search results from GNOME Calendar."
LICENSE = "GPL-3.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-shell-search-provider-gnome-calendar-44.1-1.1.noarch.rpm"
RPM_HASH = "ae5f7482bd8773dacfbc321520f2d447f3c4f60a4678899c874d6757477c9fd7a1ab30a1881c877e79a438d5ec0e1ce9db21faebd112a63c2b3e1cc6d824e5eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnome-calendar"
RDEPENDS:${PN} += "gnome-calendar"

inherit rpm
