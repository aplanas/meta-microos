SUMMARY = "ASDF schemas for units"
DESCRIPTION = "This package provides ASDF schemas for validating unit tags."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "python311-asdf-unit-schemas-0.1.0-1.3.noarch.rpm"
RPM_HASH = "e8ef08c35f034a9b9d6c58caba785085bbda7fe0fb82915396b9dce3f4192a10ed252fac57a89323e70382a7fb6281db2ecb581b06744a8a92e54068cd2a5287"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asdf-unit-schemas \
python3.11dist-asdf-unit-schemas \
python311-asdf-unit-schemas \
python3dist-asdf-unit-schemas"

RDEPENDS:${PN} += "python-abi \
python311-asdf-standard"

inherit rpm
