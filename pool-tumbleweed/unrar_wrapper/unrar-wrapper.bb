SUMMARY = "Backwards compatibility between unar and unrar"
DESCRIPTION = "Wrapper python script that transforms the basic UnRAR commands to unar \
and lsar calls in order to provide a backwards compatibility."
LICENSE = "GPL-3.0-only"

PV = "1.0.0"

RPM_NAME = "unrar_wrapper-1.0.0-5.7.noarch.rpm"
RPM_HASH = "4d9393094ad3497ca73b4bc093dd56c10c574b6ca9692c4595c76e802584e5ca0030225c21a09db482cafa75d4b62b7516996a5a6b0229979eee711bdd48677e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-unrar-wrapper \
python3dist-unrar-wrapper \
unrar \
unrar-wrapper"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-setuptools \
unar"

inherit rpm
