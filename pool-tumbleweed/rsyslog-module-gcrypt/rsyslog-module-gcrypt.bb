SUMMARY = "Libgcrypt log file encryption support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides log file encryption support using libgcrypt and \
a rsgtutil utility to manage the files."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-gcrypt-8.2212.0-2.5.aarch64.rpm"
RPM_HASH = "5ffcb646e220fb9c0526fcf097199adfc88e48226f576404d619b5f654f1b65c07e8c6312a3aae17fcdefe934a412235d6d1431e4790769051eb9e007eab347a"

RPROVIDES:${PN} += "rsyslog-module-gcrypt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
rsyslog"

inherit rpm
