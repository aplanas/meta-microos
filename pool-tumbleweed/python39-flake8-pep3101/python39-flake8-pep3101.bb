SUMMARY = "Checks for old string formatting"
DESCRIPTION = "Checks for old string formatting."
LICENSE = "GPL-2.0-only"

PV = "2.0.0"

RPM_NAME = "python39-flake8-pep3101-2.0.0-1.6.noarch.rpm"
RPM_HASH = "ba90053004b9e954e9a35fd8b2acd6b8b17f5563a02724aadd5f8417bb3ee4eec10f885a8d86bda8e306f7593d2c8616e3cedba6c76bebbfcb22ba68dca2313e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flake8-pep3101 \
python39-flake8-pep3101 \
python3dist-flake8-pep3101"

RDEPENDS:${PN} += "python-abi \
python39-flake8"

inherit rpm
