SUMMARY = "Base configuration for gender programs and libraries"
DESCRIPTION = "Base configuration files needed by the gender and libgender packages"
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "genders-base-1.28.1-2.3.aarch64.rpm"
RPM_HASH = "eaff6cd9a61d217e3b5e622dc925f0cfb0176d031ed544e94240b31e3997a07acc0444ea8a82efd49f842a5d9b9f602b8e72652d9ab02734fef0644920db6cda"

RPROVIDES:${PN} += "config(genders-base) \
genders-base \
genders-base(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
