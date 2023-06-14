SUMMARY = "PAM interface using ctypes"
DESCRIPTION = "PAM interface using ctypes."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-pamela-1.0.0-1.13.noarch.rpm"
RPM_HASH = "d19aaebae71d260793cd8c5699a2adcba2ff53dd815ef0a35bcb6177d96e1a87a288b30091f7cb61a1581ef643e615ce6f6494ff25464973c79ccac91ac5eedd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pamela \
python3.10dist-pamela \
python310-pamela \
python3dist-pamela"

RDEPENDS:${PN} += "python-abi"

inherit rpm
