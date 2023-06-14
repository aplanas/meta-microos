SUMMARY = "Python module for setting attributes of target functions or classes"
DESCRIPTION = "A decorator to set attributes of target function or class in a DRY way."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python310-attr-0.3.2-1.4.noarch.rpm"
RPM_HASH = "6e6dc18387bc49aefcfc8497751e89bb0f4170616f5e1889787c97fbbb4ee055920ddc0f1c5b7e9e644a236e657779b7b12ab3c8f0a6a64fdb8df82aa764cfb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-attr \
python3.10dist-attr \
python310-attr \
python3dist-attr"

RDEPENDS:${PN} += "python-abi"

inherit rpm
