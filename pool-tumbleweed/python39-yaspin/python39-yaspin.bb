SUMMARY = "Yet Another Terminal Spinner"
DESCRIPTION = "Yet Another Terminal Spinner."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python39-yaspin-0.18.0-1.12.noarch.rpm"
RPM_HASH = "dddde6f34246e336f9a379671918a4c159c9bdd6d32a229e214f01f20d93e469154da43966ddf277f4fc2a511f12b0ab8b387833b0480678ef25a35e3abd45f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-yaspin \
python39-yaspin \
python3dist-yaspin"

RDEPENDS:${PN} += "python-abi"

inherit rpm
