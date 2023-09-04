SUMMARY = "Python module for setting attributes of target functions or classes"
DESCRIPTION = "A decorator to set attributes of target function or class in a DRY way."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python311-attr-0.3.2-2.1.noarch.rpm"
RPM_HASH = "cb8100343d97e1c7a81d3e907d96c914e0835751f29aaff7c06817acc33bf48500e2a2424703954bbfd47ed0bcfa2c93b0d828b12ab0ed3b0d8d700da86d840b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-attr \
python3.11dist-attr \
python311-attr \
python3dist-attr"

RDEPENDS:${PN} += "python-abi"

inherit rpm
