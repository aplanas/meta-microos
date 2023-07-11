SUMMARY = "Data format conversion routines to and from YAML"
DESCRIPTION = "Format conversion routines to and from YAML."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python39-ruamel.yaml.convert-0.3.2-1.16.noarch.rpm"
RPM_HASH = "eb7651e522556c0b2238b9e637eee7f443d1f0661c87b2b855d2a2b9fced363de479303f4311c7d664917896472c5ad7b374f64b7910296605111b5a67091c71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ruamel.yaml.convert \
python39-ruamel.yaml.convert \
python3dist-ruamel.yaml.convert"

RDEPENDS:${PN} += "python-abi \
python39-python-dateutil \
python39-ruamel.base \
python39-ruamel.yaml"

inherit rpm
