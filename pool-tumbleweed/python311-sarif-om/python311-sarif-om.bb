SUMMARY = "Classes implementing the SARIF 2.1.0 object model"
DESCRIPTION = "Classes implementing the SARIF 2.1.0 object model."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python311-sarif-om-1.0.4-1.4.noarch.rpm"
RPM_HASH = "4b09c724b95fa46245671b794f49286db225636e96e6d2fe8e58929a4e145853c7f3276557617bf381c3c7991b93918b6bc6577cce6bfedb5d0c4e23f140d278"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sarif-om \
python311-sarif-om \
python3dist-sarif-om"

RDEPENDS:${PN} += "python-abi \
python311-attrs \
python311-pbr"

inherit rpm
