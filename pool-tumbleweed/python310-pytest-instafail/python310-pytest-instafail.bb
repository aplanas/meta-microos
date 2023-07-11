SUMMARY = "Pytest Plugin to Show Failures Instantly"
DESCRIPTION = "Pytest-instafail is a plugin for py.test that shows \
failures and errors instantly instead of waiting \
until the end of test session."
LICENSE = "BSD-2-Clause"

PV = "0.5.0"

RPM_NAME = "python310-pytest-instafail-0.5.0-1.3.noarch.rpm"
RPM_HASH = "3f612a5454754675e1fe66be78af7c56ba0fd42a2a49bcd447929281fd439ed53dac335bb473ddee19c15c181e23b4bf2e52ef952065e1be2fec9b0c4ad99df7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-instafail \
python310-pytest-instafail \
python3dist-pytest-instafail"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
