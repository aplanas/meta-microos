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

RPM_NAME = "sblim-wbemcli-1.6.3-2.28.aarch64.rpm"
RPM_HASH = "2aa19324a3c37b08e69c93c849ba69e26d34520bbc16e63ceb7402c81861f254d34765c288bcfb521de6c0dbb17f34e660c309bfb7cb9a3a5b0998a1ab83f2db"

RPROVIDES:${PN} += "sblim-wbemcli \
sblim-wbemcli(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
