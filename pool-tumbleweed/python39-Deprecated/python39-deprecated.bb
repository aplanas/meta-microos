SUMMARY = "Python @deprecated decorator"
DESCRIPTION = "If you need to mark a function or a method as deprecated, \
you can use the ``@deprecated`` decorator."
LICENSE = "MIT"

PV = "1.2.14"

RPM_NAME = "python39-Deprecated-1.2.14-1.1.noarch.rpm"
RPM_HASH = "73f856403ccb8fd429f070bb38ccce17fceb024e1f66b90fc50c701781bc143604f566d078d9f90ce06e58d4b1063cac4442fdc7ab9c55e1d9ae7aeedf3dd2bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(deprecated) \
python39-Deprecated \
python39-deprecated \
python3dist(deprecated)"

RDEPENDS:${PN} += "python(abi) \
python39-wrapt"

inherit rpm
