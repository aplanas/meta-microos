SUMMARY = "CUPS library configuration files"
DESCRIPTION = "CUPS is a modular printing system which allows a computer to act as a \
print server. \
 \
This subpackage contains some basic configuration files for its \
operation."
LICENSE = "Apache-2.0"

PV = "2.4.2"

RPM_NAME = "cups-config-2.4.2-5.1.aarch64.rpm"
RPM_HASH = "e2a01ced454f0c93de0feebf4c68e9c3c74a79313056fee2ad0f6cfb8e484e3f34c70eda42644f7c4bae7f6179efb056a840bf157cc341e1bfd14b1573e8ec7a"

RPROVIDES:${PN} += "config(cups-config) \
cups-config \
cups-config(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
group(lp) \
user(lp)"

inherit rpm
