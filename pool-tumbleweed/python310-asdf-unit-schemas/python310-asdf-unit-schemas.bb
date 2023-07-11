SUMMARY = "ASDF schemas for units"
DESCRIPTION = "This package provides ASDF schemas for validating unit tags."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "python310-asdf-unit-schemas-0.1.0-1.3.noarch.rpm"
RPM_HASH = "b011df42e11c6655ad3bd36df3b4809f2371bc295a900af96526a423115c663ce65a565a27a402799b0fa26dfb72d4a5c9f5445fdaf81896bf4c126850d7c966"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-asdf-unit-schemas \
python310-asdf-unit-schemas \
python3dist-asdf-unit-schemas"

RDEPENDS:${PN} += "python-abi \
python310-asdf-standard"

inherit rpm
