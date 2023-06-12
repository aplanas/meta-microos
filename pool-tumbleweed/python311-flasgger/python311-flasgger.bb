SUMMARY = "Tool to extract swagger specs from Flask projects"
DESCRIPTION = "Flasgger is a Flask extension to extract OpenAPI=Specification from all Flask views registered in an API."
LICENSE = "MIT"

PV = "0.9.5"

RPM_NAME = "python311-flasgger-0.9.5-3.1.noarch.rpm"
RPM_HASH = "2ef14844116d74d0a2a8d8808ab54d4d0fe4c2ecb40b221a0bed02d2c17f0fe359ea9fdd92dfd49c522d4f97aa234a34f5e897e47a893ee59bd399cd9c8e3e18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flasgger) \
python311-flasgger \
python3dist(flasgger)"
RDEPENDS:${PN} += "python(abi) \
python311-Flask \
python311-PyYAML \
python311-jsonschema \
python311-mistune \
python311-six"

inherit rpm
