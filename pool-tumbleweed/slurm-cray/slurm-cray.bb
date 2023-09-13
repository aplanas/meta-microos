SUMMARY = "Cray specific plugins"
DESCRIPTION = "Plugins for specific cray hardware, includes power and knl node management. \
Contains also cray specific documentation."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.4"

RPM_NAME = "slurm-cray-23.02.4-2.1.aarch64.rpm"
RPM_HASH = "88c6c14d001a23e0ee99c8a912f397c8fa3436a2fb49783342176ac91bccd6827a9bace4feb3f7e3133c1c2b4e4dba4339494a762af629d1ea06cd303a467397"

RPROVIDES:${PN} += "slurm-cray"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjson-c.so.5"

inherit rpm
