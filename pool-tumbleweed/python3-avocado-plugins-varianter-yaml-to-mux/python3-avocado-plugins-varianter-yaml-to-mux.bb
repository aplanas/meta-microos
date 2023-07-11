SUMMARY = "Avocado plugin to generate variants out of yaml files"
DESCRIPTION = "This plugin can be used to produce multiple test variants with test parameters \
defined in one or more YAML files."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "python3-avocado-plugins-varianter-yaml-to-mux-69.0-6.11.noarch.rpm"
RPM_HASH = "5a4d444521d217629a6c4eae5c23df9e95d7fb79aaccb1cbdcd39c911628fdb23dc0d122c60a2551fcb69b3346c5b108405f1ae45745991007e469775f99acc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-varianter-yaml-to-mux \
python3.11dist-avocado-framework-plugin-varianter-yaml-to-mux \
python3dist-avocado-framework-plugin-varianter-yaml-to-mux"

RDEPENDS:${PN} += "python-abi \
python3-avocado \
python3-pyaml"

inherit rpm
