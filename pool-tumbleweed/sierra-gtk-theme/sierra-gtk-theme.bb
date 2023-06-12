SUMMARY = "MacOS High Sierra like theme for GTK 3, Gnome-Shell and more"
DESCRIPTION = "MacOS High Sierra like theme for GTK 3, GTK 2, Gnome-Shell, XFWM4 and Unity."
LICENSE = "GPL-3.0-only"

PV = "20191216"

RPM_NAME = "sierra-gtk-theme-20191216-1.11.noarch.rpm"
RPM_HASH = "110351eee7e461ce3da201d534853cb7d52203cd0d1b2f32c26b82353acd9a6c47db932218f83b2c6bcf6fa801686641300bcbfb553349de9fb457048c81eaf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sierra-gtk-theme"
RDEPENDS:${PN} += ""

inherit rpm
