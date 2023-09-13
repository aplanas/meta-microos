SUMMARY = "Dracut modules usually not required for normal operation"
DESCRIPTION = "This package contains all modules that are part of dracut upstream \
but are not normally supported or required."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "059+suse.497.ga7feaf12"

RPM_NAME = "dracut-extra-059+suse.497.ga7feaf12-1.1.aarch64.rpm"
RPM_HASH = "8c094ee7c2e7624585d38352872d891fd14f55fe78fb0b9c8eda77ceaa4560c567eaf1f88413182e9ea822ebae0ecedead7749f430b998855622715ff1340070"

RPROVIDES:${PN} += "dracut-extra"

RDEPENDS:${PN} += "/usr/bin/bash \
dracut"

inherit rpm
