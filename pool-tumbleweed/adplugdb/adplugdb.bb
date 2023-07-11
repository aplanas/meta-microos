SUMMARY = "AdPlug Database Maintenance Utility"
DESCRIPTION = "adplugdb maintains database files in AdPlug database format. It can add, list \
and remove records within a central database, or merge a set of databases \
together into one single database."
LICENSE = "LGPL-2.1-only"

PV = "2.3.3"

RPM_NAME = "adplugdb-2.3.3-1.4.aarch64.rpm"
RPM_HASH = "c73da77f6c52ff8744db504211bf94893f66cc4c4245e7e72b93da2510e3070f2e9a42ec0fd125b2161110b13b734028d540a3ce5737eb76c901466df9db317c"

RPROVIDES:${PN} += "adplugdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadplug-2.3.3.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
