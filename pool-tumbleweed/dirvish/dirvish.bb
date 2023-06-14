SUMMARY = "Fast, disk based, rotating network backup system"
DESCRIPTION = "Dirvish is a fast, disk based, rotating network backup system. With dirvish you \
can maintain a set of complete images of your filesystems with unattended \
creation and expiration. A dirvish backup vault is like a time machine for your \
data."
LICENSE = "OSL-2.0"

PV = "1.2.1"

RPM_NAME = "dirvish-1.2.1-2.15.noarch.rpm"
RPM_HASH = "04edd83b9c53df9ff8d4be7caa2c363605768a33ea09ae1d40ec6fc23ed943475fb27939f2cc145aef7b88ac433fbab4733c703f64b309303f2f8ade2074eaf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dirvish \
dirvish"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl-Time--ParseDate \
perl-Time--Period \
rsync"

inherit rpm
