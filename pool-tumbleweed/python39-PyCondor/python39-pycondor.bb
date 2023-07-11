SUMMARY = "Python utility for HTCondor"
DESCRIPTION = "PyCondor (Python HTCondor) is a tool to help build and submit workflows to HTCondor in a straight-forward manner with minimal hassle."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python39-PyCondor-0.6.0-1.6.noarch.rpm"
RPM_HASH = "0f343d4d25d8d2dc80b26dbfe81f2d7855418b146130810d49839a4945ed110a5b54a20f99b89455685765c4ebb13770f8038ca99018c34609bff5573370dd15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pycondor \
python39-PyCondor \
python3dist-pycondor"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
