SUMMARY = "Data format conversion routines to and from YAML"
DESCRIPTION = "Format conversion routines to and from YAML."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python311-ruamel.yaml.convert-0.3.2-1.16.noarch.rpm"
RPM_HASH = "f3a8946c7b51f493c08a1206de3c53b56188715b26008ebb0ca5b380f6021c8d6224b5b48f52571d39850443231c660d12aa57ea6cf183978ec1dcf149338fba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ruamel.yaml.convert \
python3.11dist-ruamel.yaml.convert \
python311-ruamel.yaml.convert \
python3dist-ruamel.yaml.convert"

RDEPENDS:${PN} += "python-abi \
python311-python-dateutil \
python311-ruamel.base \
python311-ruamel.yaml"

inherit rpm
