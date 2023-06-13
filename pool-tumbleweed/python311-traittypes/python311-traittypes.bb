SUMMARY = "Scipy trait types"
DESCRIPTION = "Custom trait types for scientific computing."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "python311-traittypes-0.2.1-9.2.noarch.rpm"
RPM_HASH = "870fd8e137cc970caae55f882face67e3a3c128034a742b3aeecf509da0217048b85ef9164dc4705c6d36b5732b046cf222fad6c6cc68ba3aef24216786a5376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(traittypes) \
python311-traittypes \
python3dist(traittypes)"

RDEPENDS:${PN} += "python(abi) \
python311-traitlets"

inherit rpm
