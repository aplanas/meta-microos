SUMMARY = "Try every conceivable way to get full hostname"
DESCRIPTION = "How to get the host full name in perl on multiple operating systems (mac, \
windows, unix* etc)"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.5"

RPM_NAME = "perl-Sys-Hostname-Long-1.5-2.23.noarch.rpm"
RPM_HASH = "6f2f26b5fb075c0f74fbb5d1cb978fe93c1210b265a302e601b6d4896af0b678e41640c4fa85145b2f3ebdda6b12d10701b3119ed6e80d20e47c9a1647d112f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sys--Hostname--Long \
perl-Sys-Hostname-Long"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
