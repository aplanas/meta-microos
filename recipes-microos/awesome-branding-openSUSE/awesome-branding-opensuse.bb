SUMMARY = "openSUSE Branding for awesome"
DESCRIPTION = "This package provides the openSUSE specific additions both for \
functions and look and feel for awesome window manager."
LICENSE = "GPL-2.0-or-later"

PV = "4.0"

RPM_NAME = "awesome-branding-openSUSE-4.0-2.7.noarch.rpm"
RPM_HASH = "18717537dd6a1f115d5ea38fe6a4ed4ace34e447ba651aa68e109c77c08c04781fa9056bad6c113053c106a637468e309345a6b87312a20d15a82a31da2a4107"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "awesome-branding awesome-branding-openSUSE config(awesome-branding-openSUSE)"
RDEPENDS:${PN} += "adwaita-icon-theme awesome awesome-freedesktop awesome-vicious light-locker lua-lgi typelib(Gtk) wallpaper-branding-openSUSE"

inherit rpm
