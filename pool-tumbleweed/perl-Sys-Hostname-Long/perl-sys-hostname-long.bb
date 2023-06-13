SUMMARY = "Try every conceivable way to get full hostname"
DESCRIPTION = "How to get the host full name in perl on multiple operating systems (mac, \
windows, unix* etc)"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.5"

RPM_NAME = "perl-Sys-Hostname-Long-1.5-2.21.noarch.rpm"
RPM_HASH = "ce287ccc10a9df315737152f2e27c4ad88aeca8a688709f1c70e9ad63e07490ea8fcb5ad872e1d3a6f7da9954d793cb8fc24b576612a281a51167da4400869eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Sys::Hostname::Long) \
perl-Sys-Hostname-Long"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
