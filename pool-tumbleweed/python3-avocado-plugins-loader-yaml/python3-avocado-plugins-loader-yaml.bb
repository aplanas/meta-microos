SUMMARY = "Avocado Plugin that loads tests from YAML files"
DESCRIPTION = "This plugin can be used to produce a test suite from definitions in a YAML file, \
similar to the one used in the yaml_to_mux varianter plugin."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "python3-avocado-plugins-loader-yaml-69.0-6.11.noarch.rpm"
RPM_HASH = "4bafcbac6fde69a473c66d62126a050ff474e329e1528a399e7c66a82ca7f98a0d4cf313f98489e222605789100ee0d35e6dba7b62bf6e7e770ad2812583e3c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-loader-yaml \
python3.11dist-avocado-framework-plugin-loader-yaml \
python3dist-avocado-framework-plugin-loader-yaml"

RDEPENDS:${PN} += "python-abi \
python3-avocado-plugins-varianter-yaml-to-mux"

inherit rpm
