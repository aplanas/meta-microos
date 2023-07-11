SUMMARY = "openSUSE repository GPG keys"
DESCRIPTION = "openSUSE GPG keys for validating packages from openSUSE repositories by \
DNF and PackageKit."
LICENSE = "MIT"

PV = "0"

RPM_NAME = "rpm-repo-keys-openSUSE-0-10.1.noarch.rpm"
RPM_HASH = "82d347252280a3a7505990b17f88262b26d367082db745fd728c732d030bc4470408815e95dd11d0abb43b5d4be51f11dba2ac37cb9a7dc64c8222f41abf65c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-repo-keys-openSUSE"

RDEPENDS:${PN} += "openSUSE-build-key"

inherit rpm
