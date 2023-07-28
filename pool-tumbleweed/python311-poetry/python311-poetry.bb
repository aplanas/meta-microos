SUMMARY = "Python dependency management and packaging"
DESCRIPTION = "Python dependency management and packaging made easy."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python311-poetry-1.5.1-1.4.noarch.rpm"
RPM_HASH = "cbff04dedeeb5a011e04dc1278c2bc6277b71f1ad2344645dd77b42a7af3bddf53d4ebc7a6bf426c019471fb9b31da06b0fcba6d3c33be044ee601fbb0ce2dbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-poetry \
python3.11dist-poetry \
python311-poetry \
python3dist-poetry"

RDEPENDS:${PN} += "-python311-requests-toolbelt >= 0.9.1 with python311-requests-toolbelt < 2 \
-python311-tomlkit >= 0.11.4 with python311-tomlkit < 1.0 \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-CacheControl \
python311-build \
python311-cleo \
python311-crashtest \
python311-dulwich \
python311-filelock \
python311-html5lib \
python311-installer \
python311-jsonschema \
python311-keyring \
python311-lockfile \
python311-packaging \
python311-pexpect \
python311-pkginfo \
python311-platformdirs \
python311-poetry-core \
python311-poetry-plugin-export \
python311-pyproject-hooks \
python311-requests \
python311-shellingham \
python311-trove-classifiers \
python311-urllib3 \
python311-virtualenv \
update-alternatives"

inherit rpm
