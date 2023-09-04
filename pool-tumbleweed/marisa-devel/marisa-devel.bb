SUMMARY = "Development files for marisa"
DESCRIPTION = "The marisa-devel package contains libraries and header files for \
developing applications that use marisa."
LICENSE = "LGPL-2.1-or-later | BSD-2-Clause"

PV = "0.2.6"

RPM_NAME = "marisa-devel-0.2.6-1.24.aarch64.rpm"
RPM_HASH = "8ef87d0b28d01271a59f5de50afc19af56e151f34a6042b359c6eac0539b0e2f58ff3a6c79e3f6850ddc71b7e32db195f63fe7544537c6d0e341b201c42e0f9e"

RPROVIDES:${PN} += "marisa-devel \
pkgconfig-marisa"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
marisa \
perl-marisa \
python3-marisa \
ruby-marisa"

inherit rpm
