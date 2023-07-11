SUMMARY = "Python at the shell"
DESCRIPTION = "Easily run Python at the shell! Magical, but never mysterious. \
 \
See README.md or https://github.com/hauntsaninja/pyp for examples."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-pyp-1.1.0-1.5.noarch.rpm"
RPM_HASH = "f82f431f4e77332f6f16d5f198b4261ac003d862c4238d7fcdeeef5834c4fbd6d2e5c3b3b921fd14a4fc24eaac82d46af07e2afa2c967b1d0e9d94d82dad699e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyp \
python3.11dist-pypyp \
python311-pyp \
python3dist-pypyp"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-astunparse \
update-alternatives"

inherit rpm
