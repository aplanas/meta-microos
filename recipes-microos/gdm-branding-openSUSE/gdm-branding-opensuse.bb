SUMMARY = "The GNOME Display Manager -- openSUSE default configuration"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays. \
 \
This package provides the openSUSE default configuration for gdm."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "gdm-branding-openSUSE-15.1-3.1.noarch.rpm"
RPM_HASH = "9ba4bec54256ae08efebf728dc03b5994747c87fb4fefe17e0308a5712aeb9e6a5d6daaecf54a17084c42b8ad0bc4b28e3f1ce379e0fbf720f1a8d7a18703aba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(gdm-branding-openSUSE) gdm-branding gdm-branding-openSUSE"
RDEPENDS:${PN} += "distribution-logos gdm"

inherit rpm
