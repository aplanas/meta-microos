SUMMARY = "McCabe checker, plugin for flake8"
DESCRIPTION = "Ned's script to check McCabe complexity. \
This module provides a plugin for flake8, the Python code checker."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python311-mccabe-0.7.0-2.1.noarch.rpm"
RPM_HASH = "767f8f3b49cb1ec0fcc8b935acf163c4241efddc5d00793f93e0469f2ac9734dc4e54ca6b41b2e0b5cf268fc36847d009410d32447bf572a6b934810c4d12ab2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mccabe) \
python311-mccabe \
python3dist(mccabe)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
