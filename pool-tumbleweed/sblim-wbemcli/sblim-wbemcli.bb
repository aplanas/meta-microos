SUMMARY = "SBLIM WBEM Command Line Interface"
DESCRIPTION = "WBEM Command Line Interface is a standalone, command line WBEM client. \
It is especially suited for basic systems management tasks as it can be \
used in scripts. \
 \
 \
 \
Authors: \
-------- \
    SBLIM Project <http://www-124.ibm.com/sblim/>"
LICENSE = "EPL-1.0"

PV = "1.6.3"

RPM_NAME = "sblim-wbemcli-1.6.3-2.29.aarch64.rpm"
RPM_HASH = "628a46c4b3f4266bdb5d290b7af6012d2c25895f1a6a16a41d24e97a4ed9e9406b8817492c4206019277b5dd0eda1724b6a8966518968afd8f638678e6e40c1d"

RPROVIDES:${PN} += "sblim-wbemcli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
