SUMMARY = "Package, Patch, Pattern, and Product Management - testsuite-tools"
DESCRIPTION = "Package, Patch, Pattern, and Product Management - testsuite-tools \
 \
Authors: \
-------- \
    Michael Andres <ma@suse.de> \
    Jiri Srain <jsrain@suse.cz> \
    Stefan Schubert <schubi@suse.de> \
    Duncan Mac-Vicar <dmacvicar@suse.de> \
    Klaus Kaempf <kkaempf@suse.de> \
    Marius Tomaschewski <mt@suse.de> \
    Stanislav Visnovsky <visnov@suse.cz> \
    Ladislav Slezak <lslezak@suse.cz>"
LICENSE = "GPL-2.0-only"

PV = "5.0.5"

RPM_NAME = "libzypp-testsuite-tools-5.0.5-1.8.aarch64.rpm"
RPM_HASH = "e8972129c1c0f44ea7d58cf13e1ce3ed7f2c92c026c2d89a4a9af6bd989bf37bf16acd077d9387f811bb060e4713b3427f29ef3ab50fdf8fc67d7d17ae8832e4"

RPROVIDES:${PN} += "libzypp-testsuite-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libzypp.so.1722"

inherit rpm
