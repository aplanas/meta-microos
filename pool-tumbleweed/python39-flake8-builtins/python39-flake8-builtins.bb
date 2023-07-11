SUMMARY = "Flake8 Builtins plugin"
DESCRIPTION = "This plugin checks for Python builtins being used as variables or parameters."
LICENSE = "GPL-2.0-only"

PV = "2.1.0"

RPM_NAME = "python39-flake8-builtins-2.1.0-1.5.noarch.rpm"
RPM_HASH = "eaa6dd9e77930cc7b89823a47d6e18eab58c27e61c3773ef946084dc21f08c1f7e2b84c717fd31ac166fc9a9607985fad3db4585536f16924397ce3a828cec71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flake8-builtins \
python39-flake8-builtins \
python3dist-flake8-builtins"

RDEPENDS:${PN} += "python-abi \
python39-flake8"

inherit rpm
