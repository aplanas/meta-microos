SUMMARY = "A port of Ruby on Rails inflector to Python"
DESCRIPTION = "Inflection is a string transformation library.  It singularizes and pluralizes \
English words, and transforms strings from CamelCase to underscored string. \
Inflection is a port of `Ruby on Rails`_' `inflector`_ to Python."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python311-inflection-0.5.1-2.10.noarch.rpm"
RPM_HASH = "a601d6457629799bc5a2d3996d0a9e9d1f1d226a396a22258d2cfe428a062e0586a8523f5142551c632bfc507487f94736c2b3d7d3087e85ea9226d5ef975f7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-inflection \
python3.11dist-inflection \
python311-inflection \
python3dist-inflection"

RDEPENDS:${PN} += "python-abi"

inherit rpm
