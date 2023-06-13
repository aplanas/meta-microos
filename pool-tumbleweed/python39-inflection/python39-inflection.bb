SUMMARY = "A port of Ruby on Rails inflector to Python"
DESCRIPTION = "Inflection is a string transformation library.  It singularizes and pluralizes \
English words, and transforms strings from CamelCase to underscored string. \
Inflection is a port of `Ruby on Rails`_' `inflector`_ to Python."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python39-inflection-0.5.1-2.8.noarch.rpm"
RPM_HASH = "804bb86f6a9127a1d5cf6b267505c7f48f07c0786d80f3a62e09f111db75bc2f5877dcd385d80446ddf846067e2d5f9949346ce68563fa408ce34dee9c04b9c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(inflection) \
python39-inflection \
python3dist(inflection)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
