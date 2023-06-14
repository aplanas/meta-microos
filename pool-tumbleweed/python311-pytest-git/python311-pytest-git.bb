SUMMARY = "Git repository fixture for pytest"
DESCRIPTION = "Git repository fixture for py.test"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python311-pytest-git-1.7.0-2.13.noarch.rpm"
RPM_HASH = "ae07debbd286146205c7a3137667c766a43401a02aed8757b9eea44b7d334cf2c89c3a4b7c4baa6c576ab4819a8583ab4fdef9db507985ef652761be783de6d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-git \
python311-pytest-git \
python3dist-pytest-git"

RDEPENDS:${PN} += "python-abi \
python311-GitPython \
python311-pytest \
python311-pytest-shutil"

inherit rpm
