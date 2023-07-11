SUMMARY = "A port of Ruby on Rails inflector to Python"
DESCRIPTION = "Inflection is a string transformation library.  It singularizes and pluralizes \
English words, and transforms strings from CamelCase to underscored string. \
Inflection is a port of `Ruby on Rails`_' `inflector`_ to Python."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python310-inflection-0.5.1-2.10.noarch.rpm"
RPM_HASH = "821298100468f09d25198876e0cae761842fd8e9a5b56bee8bdfae8ad1fc5cc083f4d00f41c97723d3c847c0b68b6cc0de133ab442321e9d59da9f1c74384e98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-inflection \
python310-inflection \
python3dist-inflection"

RDEPENDS:${PN} += "python-abi"

inherit rpm
