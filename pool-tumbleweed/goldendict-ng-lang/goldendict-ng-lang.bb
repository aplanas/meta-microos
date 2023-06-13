SUMMARY = "Translations for package goldendict-ng"
DESCRIPTION = "Provides translations for the 'goldendict-ng' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.05.03"

RPM_NAME = "goldendict-ng-lang-23.05.03-1.1.noarch.rpm"
RPM_HASH = "fb7afb4f297fb1bcb0ffad2263cbf94444d57b7b6bac560f3229a29a8b07d1921617e171e34effd9e2069e96fabeeb106b1dc4bf39b3d844da915b7b37ca1e1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "goldendict-ng-lang \
goldendict-ng-lang-all"

RDEPENDS:${PN} += "goldendict-ng"

inherit rpm
