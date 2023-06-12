SUMMARY = "openSUSE repository GPG keys"
DESCRIPTION = "openSUSE GPG keys for validating packages from openSUSE repositories by \
DNF and PackageKit."
LICENSE = "MIT"

PV = "0"

RPM_NAME = "rpm-repo-keys-openSUSE-0-9.3.noarch.rpm"
RPM_HASH = "dc5f5a0252fb027cc6e4e242e29a077eaf11459adc1cd75221c990cffd268109bcf6586c81ecea305d51654ca41a13c4469023193872c8035908f649a28132d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-repo-keys-openSUSE"
RDEPENDS:${PN} += "openSUSE-build-key"

inherit rpm
