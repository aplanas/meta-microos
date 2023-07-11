SUMMARY = "Avocado Plugin for Execution of golang tests"
DESCRIPTION = "This plugin allows Avocado to list golang tests, and if golang is installed, \
to also run them."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "python3-avocado-plugins-golang-69.0-6.11.noarch.rpm"
RPM_HASH = "0545bb668129df453804389d1856a371a15c7879ebb3078f1d4092d9d3ea29917955a1ab57b6ecc96337073d28cb939126bae1bcd9bfde48ec5e398c7ed35634"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-golang \
python3.11dist-avocado-framework-plugin-golang \
python3dist-avocado-framework-plugin-golang"

RDEPENDS:${PN} += "go \
python-abi \
python3-avocado"

inherit rpm
