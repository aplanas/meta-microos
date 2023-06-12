SUMMARY = "Fastest Python implementation of JSON schema"
DESCRIPTION = "Fastest Python implementation of JSON schema"
LICENSE = "BSD-3-Clause"

PV = "2.17.1"

RPM_NAME = "python310-fastjsonschema-2.17.1-1.1.noarch.rpm"
RPM_HASH = "9935622399d5db9ed8412fdd02dafc3b975d4e9f510348d407a4013f658183fc8c172970bce2aee4ba09eb2fe43ac55d4319d5a18608422bb1b0fd8039573a16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fastjsonschema \
python3.10dist(fastjsonschema) \
python310-fastjsonschema \
python3dist(fastjsonschema)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
