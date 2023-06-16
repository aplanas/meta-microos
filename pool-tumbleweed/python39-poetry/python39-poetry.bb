SUMMARY = "Python dependency management and packaging"
DESCRIPTION = "Python dependency management and packaging made easy."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python39-poetry-1.5.1-1.1.noarch.rpm"
RPM_HASH = "e7bcd526a7973ecab76956b2c0e494f9d52627d493d2dc80d7e97fd494ba0910b6ee1baf6c3423bdd2ca642b2eb598de0d7d1463c1e5306afebc41592b613964"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-poetry \
python39-poetry \
python3dist-poetry"

RDEPENDS:${PN} += "-python39-requests-toolbelt >= 0.9.1 with python39-requests-toolbelt < 2 \
-python39-tomlkit >= 0.11.4 with python39-tomlkit < 1.0 \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-CacheControl \
python39-build \
python39-cleo \
python39-crashtest \
python39-dulwich \
python39-filelock \
python39-html5lib \
python39-importlib-metadata \
python39-installer \
python39-jsonschema \
python39-keyring \
python39-lockfile \
python39-packaging \
python39-pexpect \
python39-pkginfo \
python39-platformdirs \
python39-poetry-core \
python39-poetry-plugin-export \
python39-pyproject-hooks \
python39-requests \
python39-shellingham \
python39-tomli \
python39-trove-classifiers \
python39-urllib3 \
python39-virtualenv \
update-alternatives"

inherit rpm
