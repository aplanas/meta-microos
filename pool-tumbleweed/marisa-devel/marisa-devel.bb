SUMMARY = "Development files for marisa"
DESCRIPTION = "The marisa-devel package contains libraries and header files for \
developing applications that use marisa."
LICENSE = "LGPL-2.1-or-later | BSD-2-Clause"

PV = "0.2.6"

RPM_NAME = "marisa-devel-0.2.6-1.23.aarch64.rpm"
RPM_HASH = "ee200dcc09e7dfc6e4363b579e5ef082f856a756beb6a0177825f3a2b89939c6d59344f05011fc3a009daae6eeef3ae9ff6d34043d002eadbde90bf32690c752"

RPROVIDES:${PN} += "marisa-devel \
pkgconfig-marisa"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
marisa \
perl-marisa \
python3-marisa \
ruby-marisa"

inherit rpm
