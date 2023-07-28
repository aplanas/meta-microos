SUMMARY = "Additional documentation for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This package provides additional documentation for rsyslog."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2306.0"

RPM_NAME = "rsyslog-doc-8.2306.0-1.1.aarch64.rpm"
RPM_HASH = "ca97f1aaf385f28dd1667892049cfbe932884a44495540727896bba381a63c0e474db3cd39b7b4e4285abed9453e64086ac145191034d2c8848f32c4757d8103"

RPROVIDES:${PN} += "rsyslog-doc"

RDEPENDS:${PN} += ""

inherit rpm
