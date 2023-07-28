SUMMARY = "Python dependency management and packaging"
DESCRIPTION = "Python dependency management and packaging made easy."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python310-poetry-1.5.1-1.4.noarch.rpm"
RPM_HASH = "2cc479c585f5246dbeecc44c6fc5b10d7464554dec571b2c85e2ff9bb6dcf19ba454b0530c62418c07dea5ec581f795b0946ec9938afa878b6d021af36967b46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-poetry \
python310-poetry \
python3dist-poetry"

RDEPENDS:${PN} += "-python310-requests-toolbelt >= 0.9.1 with python310-requests-toolbelt < 2 \
-python310-tomlkit >= 0.11.4 with python310-tomlkit < 1.0 \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-CacheControl \
python310-build \
python310-cleo \
python310-crashtest \
python310-dulwich \
python310-filelock \
python310-html5lib \
python310-installer \
python310-jsonschema \
python310-keyring \
python310-lockfile \
python310-packaging \
python310-pexpect \
python310-pkginfo \
python310-platformdirs \
python310-poetry-core \
python310-poetry-plugin-export \
python310-pyproject-hooks \
python310-requests \
python310-shellingham \
python310-tomli \
python310-trove-classifiers \
python310-urllib3 \
python310-virtualenv \
update-alternatives"

inherit rpm
