SUMMARY = "The su-wrapper Runs Programs as Another User and Group"
DESCRIPTION = "su-wrapper is a little utility that allows special users to execute \
processes under another uid and gid. \
 \
It uses a table (/etc/su-wrapper.conf) to decide whatto do in certain \
situation. Therefore it walks through the table and tries to match the \
current situation (the later entries have precedence). \
 \
For more information, read /usr/share/doc/packages/su-wrapper/README. \
 \
 \
 \
Authors: \
-------- \
    Enrico Weigelt <weigelt@nibiru.thur.de> \
    Werner Fink <werner@suse.de>"
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "su-wrapper-1.2.0-498.17.aarch64.rpm"
RPM_HASH = "fa3eac103ce31ffa7907b8c04bb0e4d5febf8552709ff31c95f0fa0881e17de8160db26320d121040ae1f57cc7be1181eab21c249cb18ad3415bee153f1be324"

RPROVIDES:${PN} += "config-su-wrapper \
su-wrapper"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
permissions"

inherit rpm
