SUMMARY = "CUPS library configuration files"
DESCRIPTION = "CUPS is a modular printing system which allows a computer to act as a \
print server. \
 \
This subpackage contains some basic configuration files for its \
operation."
LICENSE = "Apache-2.0"

PV = "2.4.2"

RPM_NAME = "cups-config-2.4.2-4.3.aarch64.rpm"
RPM_HASH = "c2948e1b734719689da492a194219f4c14d24a710df70ea93458cb058bec243073fa9c2097dcc26de3aff6f41856a3981a559f43c6392c22ee8808fa9bb95866"

RPROVIDES:${PN} += "config(cups-config) cups-config cups-config(aarch-64)"
RDEPENDS:${PN} += "/bin/sh group(lp) user(lp)"

inherit rpm
