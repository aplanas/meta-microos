SUMMARY = "SELinux module for the Software TPM emulator"
DESCRIPTION = "This package provides the SELinux module for the Software TPM emulator."
LICENSE = "BSD-3-Clause"

PV = "0.8.0"

RPM_NAME = "swtpm-selinux-0.8.0-4.1.noarch.rpm"
RPM_HASH = "389329e0d49c45f9f8cfe4c92fb4c570d6192fe1755acc64e4921f0879bbe80b18ac83ee951d8fb66525bf831faf1b71d5e47604b2fa04159c46389dd0cad5ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swtpm-selinux"

RDEPENDS:${PN} += "/usr/bin/sh \
libselinux-utils \
policycoreutils \
policycoreutils-python-utils \
selinux-policy \
selinux-policy-base \
swtpm"

inherit rpm
