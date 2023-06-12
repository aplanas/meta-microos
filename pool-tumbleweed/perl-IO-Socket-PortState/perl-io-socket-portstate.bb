SUMMARY = "Perl extension for checking the open or closed status of a port."
DESCRIPTION = "You can use it to check if a port is open or closed for a given host and \
protocol."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.03"

RPM_NAME = "perl-IO-Socket-PortState-0.03-3.26.noarch.rpm"
RPM_HASH = "736a3eb3a4186f69087238a0b3941e1f0b090eafb37cda49bb4e6cdc7b03ab8d9fd5eb31693bd01bdacf8e87f1fb9cab729397b496efc4e5e66e4b3314bf87bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(IO::Socket::PortState) \
perl-IO-Socket-PortState"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
