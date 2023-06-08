SUMMARY = "Enlightenment openSUSE profiles"
DESCRIPTION = "openSUSE variant of profiles for enlightenment."
LICENSE = "BSD-2-Clause"

PV = "20220317"

RPM_NAME = "enlightenment-profiles-openSUSE-20220317-1.5.noarch.rpm"
RPM_HASH = "ffbfbe3ea81e0d672ceeafffa3d5e1653b4245bca5f1dd49359e9cc4cf97c787a2d65777267f391918ad34fb6c25c1ead737e35253af3a6c7cfba39dd53d884f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "enlightenment-profiles-openSUSE"
RDEPENDS:${PN} += "enlightenment-theme-dft"

inherit rpm
