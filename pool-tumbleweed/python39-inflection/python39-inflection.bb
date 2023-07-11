SUMMARY = "A port of Ruby on Rails inflector to Python"
DESCRIPTION = "Inflection is a string transformation library.  It singularizes and pluralizes \
English words, and transforms strings from CamelCase to underscored string. \
Inflection is a port of `Ruby on Rails`_' `inflector`_ to Python."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python39-inflection-0.5.1-2.10.noarch.rpm"
RPM_HASH = "791afe582de568cce95d00cc81a2eac8b48a9dc96ca70390ccf2fdf424897d2d42ef6fab5ed4fb38080412cb41c0103578ab2752db331d8c00850db2c3d74b21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-inflection \
python39-inflection \
python3dist-inflection"

RDEPENDS:${PN} += "python-abi"

inherit rpm
