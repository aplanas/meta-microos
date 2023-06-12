SUMMARY = "Upstream Branding of thunar-volman"
DESCRIPTION = "This package provides the upstream look and feel for the Thunar Volume Manager."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "thunar-volman-branding-upstream-4.18.0-1.3.noarch.rpm"
RPM_HASH = "fc09b03b084b73f9ee344e9b202f76d804328917b943ba5ff4afb907ed3f3da5788697ccc015627a4206f1e0f45c4bfcab37d5e858300ff4fa1bd5cc21a9fec7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(thunar-volman-branding-upstream) \
thunar-volman-branding \
thunar-volman-branding-upstream"
RDEPENDS:${PN} += ""

inherit rpm
