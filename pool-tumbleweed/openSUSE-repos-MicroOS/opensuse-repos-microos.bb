SUMMARY = "openSUSE package repositories"
DESCRIPTION = "Definitions for openSUSE repository management via zypp-services"
LICENSE = "MIT"

PV = "20230731.a018a46"

RPM_NAME = "openSUSE-repos-MicroOS-20230731.a018a46-1.1.aarch64.rpm"
RPM_HASH = "d26007414dfc32ea74a01e8c195464ffc809bf29bfe20077e271a78cf3f771cf17ad53b7cb55222d1cf8df3d181c9efcf9d818df4703f2ac843f1b164ce8e7b9"

RPROVIDES:${PN} += "openSUSE-repos \
openSUSE-repos-MicroOS"

RDEPENDS:${PN} += "/usr/bin/sh \
zypper"

inherit rpm
