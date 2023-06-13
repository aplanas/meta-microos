SUMMARY = "Collect kubernetes cluster configmaps and store it"
DESCRIPTION = "Collect kubernetes cluster configmaps with a specified label and store the included files in an local folder."
LICENSE = "MIT"

PV = "0.1.144"

RPM_NAME = "k8s-sidecar-0.1.144-1.7.noarch.rpm"
RPM_HASH = "7b805f1726292bc80cdc2bbcf43ecbebe5d1eb44d2a26c2cae82c8fbe524b06948d5f51d344a2dda46d1e3ce11b6328cf28d9cca2ad7d8c0610ad01e7c2f03ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "k8s-sidecar"

RDEPENDS:${PN} += "python3 \
python3-kubernetes \
python3-requests"

inherit rpm
