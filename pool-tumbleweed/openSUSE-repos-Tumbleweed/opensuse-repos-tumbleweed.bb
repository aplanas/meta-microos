SUMMARY = "openSUSE package repositories"
DESCRIPTION = "Definitions for openSUSE repository management via zypp-services"
LICENSE = "MIT"

PV = "20230209.87a5e9e"

RPM_NAME = "openSUSE-repos-Tumbleweed-20230209.87a5e9e-1.1.aarch64.rpm"
RPM_HASH = "7c35b3d477af998d16e3e1fd5a20b0c1a4ddad9b84b9fda3b91de0f1525796f059714fcbddf999e652d8a0d7dc23abd3276394eb33e5c4275c7bb898053e44df"

RPROVIDES:${PN} += "openSUSE-repos \
openSUSE-repos-Tumbleweed \
openSUSE-repos-Tumbleweed(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
zypper"

inherit rpm
