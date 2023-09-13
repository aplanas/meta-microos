SUMMARY = "Munin scripts"
DESCRIPTION = "Use this package to install munin scripts that allow to monitor some openQA \
statistics."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1694101660.598baea"

RPM_NAME = "openQA-munin-4.6.1694101660.598baea-1.1.aarch64.rpm"
RPM_HASH = "6cf0dde7cdef9bb9865ba680995ba65253705803bfa42eba684da20fa8f525fd8c6c4ee029f10172ceabc0e831357f3e0b68cf1aabe729ca50ade5fae933c8a8"

RPROVIDES:${PN} += "config-openQA-munin \
openQA-munin"

RDEPENDS:${PN} += "/usr/bin/perl \
curl \
munin \
munin-node \
perl"

inherit rpm
