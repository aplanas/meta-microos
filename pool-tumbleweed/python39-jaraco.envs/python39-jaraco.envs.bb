SUMMARY = "Classes for Python Virtual Environments"
DESCRIPTION = "Classes for orchestrating Python (virtual) environments."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python39-jaraco.envs-2.4.0-3.1.noarch.rpm"
RPM_HASH = "a297c866de6f9e1e984b5ee59d2c1fb4041941b779664266afe0ca3ffcbc8b2478e494e7cf28866ef282f75c5c98e816156c9830a241eeddf7c8037429d11f2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jaraco.envs) \
python39-jaraco.envs \
python3dist(jaraco.envs)"

RDEPENDS:${PN} += "python(abi) \
python39-path \
python39-virtualenv"

inherit rpm
