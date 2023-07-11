SUMMARY = "Classes implementing the SARIF 2.1.0 object model"
DESCRIPTION = "Classes implementing the SARIF 2.1.0 object model."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python311-sarif-om-1.0.4-2.3.noarch.rpm"
RPM_HASH = "ba844049e7d45bde238a861df5f1caae42e15ad4540fa26d91dbd4ab7195d713b028087b107c16d7c2c496dccb0f4c2c36ee50f1668f2e7ae489fa148e8034b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sarif-om \
python3.11dist-sarif-om \
python311-sarif-om \
python3dist-sarif-om"

RDEPENDS:${PN} += "python-abi \
python311-attrs \
python311-pbr"

inherit rpm
