SUMMARY = "Avocado plugin to generate variants out of yaml files"
DESCRIPTION = "This plugin can be used to produce multiple test variants with test parameters \
defined in one or more YAML files."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "python3-avocado-plugins-varianter-yaml-to-mux-69.0-6.10.noarch.rpm"
RPM_HASH = "d2dbf1ce88471b4c32b13e49831a220098449f44997880a12f14746a38bd97a6918882fde1a2312f4514ca8832e168b88ae1f4689ec83faa13ba13c17fba6e71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-varianter-yaml-to-mux \
python3.10dist-avocado-framework-plugin-varianter-yaml-to-mux \
python3dist-avocado-framework-plugin-varianter-yaml-to-mux"

RDEPENDS:${PN} += "python-abi \
python3-avocado \
python3-pyaml"

inherit rpm
