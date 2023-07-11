SUMMARY = "Translations for package plasma-applet-weather-widget"
DESCRIPTION = "Provides translations for the 'plasma-applet-weather-widget' package."
LICENSE = "GPL-2.0-only"

PV = "1.6.10"

RPM_NAME = "plasma-applet-weather-widget-lang-1.6.10-5.8.noarch.rpm"
RPM_HASH = "193d68ff1254da10121fe9879db96195745f25218138e8d10b2ca542d79198472f276445c17e39e0b2552ca2a145ed63a8e73ccc330e0ea6c934744d24529cd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma-applet-weather-widget-bg \
locale-plasma-applet-weather-widget-cs \
locale-plasma-applet-weather-widget-de \
locale-plasma-applet-weather-widget-en \
locale-plasma-applet-weather-widget-es \
locale-plasma-applet-weather-widget-fr \
locale-plasma-applet-weather-widget-hu \
locale-plasma-applet-weather-widget-it-IT \
locale-plasma-applet-weather-widget-pl \
locale-plasma-applet-weather-widget-ru \
locale-plasma-applet-weather-widget-zh-CN \
locale-plasma-applet-weather-widget-zh-TW \
plasma-applet-weather-widget-lang \
plasma-applet-weather-widget-lang-all"

RDEPENDS:${PN} += "plasma-applet-weather-widget"

inherit rpm
