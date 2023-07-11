SUMMARY = "Pretty printer for pytest progress"
DESCRIPTION = "pytest-sugar is a plugin for py.test that shows failures and errors instantly and shows a progress bar."
LICENSE = "BSD-3-Clause"

PV = "0.9.7"

RPM_NAME = "python311-pytest-sugar-0.9.7-1.3.noarch.rpm"
RPM_HASH = "14502584bd8ea5c85c2552bc24044248e87890a03016cf578e66e65896d93606d934192f8a73855e275306656143de73c67942d85d065884d9db001ed5223133"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-sugar \
python3.11dist-pytest-sugar \
python311-pytest-sugar \
python3dist-pytest-sugar"

RDEPENDS:${PN} += "python-abi \
python311-pytest \
python311-termcolor"

inherit rpm
