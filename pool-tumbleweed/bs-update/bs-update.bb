SUMMARY = "Automate maintenance of packages in a Build Service"
DESCRIPTION = "bs-update makes it easier to keep packages in a Build Service \
up-to-date with respect to their upstream sources."
LICENSE = "MIT"

PV = "0.18"

RPM_NAME = "bs-update-0.18-1.16.noarch.rpm"
RPM_HASH = "cf2c7148143d240baae22d8323ec335502e90d24eb0dad549afa812439a5ab238579c4f057e80b8146c212797c6128a3a8385aa5786be54ebb3c6f71772946d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bs-update"

RDEPENDS:${PN} += "/usr/bin/env \
coreutils \
gzip \
osc \
sed \
tar \
wget \
zsh"

inherit rpm
