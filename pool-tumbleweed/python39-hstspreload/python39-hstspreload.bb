SUMMARY = "Python Chromium HSTS Preload list"
DESCRIPTION = "Chromium HSTS Preload list as a Python package."
LICENSE = "BSD-3-Clause"

PV = "2023.1.1"

RPM_NAME = "python39-hstspreload-2023.1.1-1.5.noarch.rpm"
RPM_HASH = "bbe970fce8bbc935f90dd3e6dbf78f7895c3f8167e1c79d2cba1ab50ee63f97c906a3c782ff924ea446d7c65bb57cc344d13047186e8b5eb7251c16ef2bae41d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hstspreload \
python39-hstspreload \
python3dist-hstspreload"

RDEPENDS:${PN} += "python-abi"

inherit rpm
