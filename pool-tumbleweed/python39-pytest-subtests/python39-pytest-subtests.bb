SUMMARY = "Python unittest subTest() support and subtests fixture"
DESCRIPTION = "Python unittest subTest() support and subtests fixture."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python39-pytest-subtests-0.11.0-1.1.noarch.rpm"
RPM_HASH = "5af3d7423a6bca7c03206303f49a3459d9531767f5ecddb08fc21ce3d23e5a1ce71277016a1c24a907d2a3494f1d2acc5765e3f65a216176ca58dc0c9ece9f1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-subtests \
python39-pytest-subtests \
python3dist-pytest-subtests"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
