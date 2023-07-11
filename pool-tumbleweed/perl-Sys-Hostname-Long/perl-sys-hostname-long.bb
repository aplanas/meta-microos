SUMMARY = "Try every conceivable way to get full hostname"
DESCRIPTION = "How to get the host full name in perl on multiple operating systems (mac, \
windows, unix* etc)"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.5"

RPM_NAME = "perl-Sys-Hostname-Long-1.5-2.22.noarch.rpm"
RPM_HASH = "720183f0ebf81737b2c2f20737cac7aff3491dc71af8380151052ece76ce97aa668c0c4f1fc760898358f4ce601642a71cb06bbe79449ce14d42e07026e5bb89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sys--Hostname--Long \
perl-Sys-Hostname-Long"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
