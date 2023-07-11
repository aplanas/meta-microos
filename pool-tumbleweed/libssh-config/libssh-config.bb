SUMMARY = "SSH library configuration files"
DESCRIPTION = "Configuration files for the SSH library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.5"

RPM_NAME = "libssh-config-0.10.5-1.2.aarch64.rpm"
RPM_HASH = "08501fc83122fdbd1b02875ffb4b08fff41bdfe4f2aa561b8ab86cc016c980c985b6c38800452387e07229099c73ce35dda8e4a96c7f3a22930c6727af43828d"

RPROVIDES:${PN} += "config-libssh-config \
libssh-config"

RDEPENDS:${PN} += ""

inherit rpm
