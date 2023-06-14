SUMMARY = "Checks for old string formatting"
DESCRIPTION = "Checks for old string formatting."
LICENSE = "GPL-2.0-only"

PV = "2.0.0"

RPM_NAME = "python39-flake8-pep3101-2.0.0-1.4.noarch.rpm"
RPM_HASH = "af0828c2661dd30b57c54ef243b2a8f94fd4f8b238aabefcfe073c67087012cd4d9d044e3fa9c8b2465cc29df11cf356cc523b9b0d40693312b19291b0f4b01f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flake8-pep3101 \
python39-flake8-pep3101 \
python3dist-flake8-pep3101"

RDEPENDS:${PN} += "python-abi \
python39-flake8"

inherit rpm
