SUMMARY = "Traitlets Python configuration system"
DESCRIPTION = "A configuration system for Python applications."
LICENSE = "BSD-3-Clause"

PV = "5.9.0"

RPM_NAME = "python311-traitlets-5.9.0-2.3.noarch.rpm"
RPM_HASH = "4e391866a29bae0da9d9d8eb1def1245d9d3f93890c729c6446e1840bb252c458a3ee6aa5ca26581dddff391ab7c136542908d9c50fe79ebb0062d8ae91a8741"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-traitlets \
python3.11dist-traitlets \
python311-traitlets \
python3dist-traitlets"

RDEPENDS:${PN} += "python-abi"

inherit rpm
