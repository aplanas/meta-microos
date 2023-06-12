SUMMARY = "pytest integration for aiomisc"
DESCRIPTION = "This package contains a plugin for pytest."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python311-aiomisc-pytest-1.1.1-1.1.noarch.rpm"
RPM_HASH = "13e2cbbc9243cf2941d89a12f6cee781f24308c8e44a6d4d55fd72e0166e3f5711f4d1faf84c1f30cff254edbe84fde78ae43c121f84400ba8f0d63d5577d18d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(aiomisc-pytest) \
python311-aiomisc-pytest \
python3dist(aiomisc-pytest)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
