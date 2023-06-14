SUMMARY = "Upstream Branding of garcon"
DESCRIPTION = "This package provides the upstream look and feel for garcon."
LICENSE = "GFDL-1.1-only & LGPL-2.0-only"

PV = "4.18.1"

RPM_NAME = "libgarcon-branding-upstream-4.18.1-2.1.noarch.rpm"
RPM_HASH = "e71979aef75d3901cae48807e767c4a464a7a37d29f5a42fc37bafaea5545542498fa9ab8aafcea55ef2b54cc7d38799e56468a95faa3fd7b1587d8bbb53b6fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libgarcon-branding-upstream \
libgarcon-branding \
libgarcon-branding-upstream"

RDEPENDS:${PN} += "libxfce4ui-tools"

inherit rpm
