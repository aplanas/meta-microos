SUMMARY = "A Material Design theme for GNOME/GTK+ based desktop environments"
DESCRIPTION = "Materia (formerly Flat-Plat) is a Material Design theme for GNOME/GTK+ based desktop environments. \
It supports GTK+ 3, GTK+ 2, GNOME Shell, Budgie, Cinnamon, MATE, Unity, LightDM, GDM, Chrome theme, etc."
LICENSE = "GPL-2.0-only"

PV = "20210322"

RPM_NAME = "materia-gtk-theme-20210322-1.6.noarch.rpm"
RPM_HASH = "892db19f812290d10ced49e5825be00d850f7feea7e6e3322b85f554ceeb9440fc5ce4c898529e65cca293fe328cc003d52f8c2fbac3406c7549683a6500c19d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "materia-gtk-theme"
RDEPENDS:${PN} += "gnome-themes-extras"

inherit rpm
