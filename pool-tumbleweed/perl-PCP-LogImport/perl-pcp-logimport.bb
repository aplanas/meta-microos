SUMMARY = "Performance Co-Pilot Perl bindings for importing external archive data"
DESCRIPTION = "The PCP::LogImport module contains the Perl language bindings for \
importing data in various 3rd party formats into PCP archives so \
they can be replayed with standard PCP monitoring tools."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "perl-PCP-LogImport-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "59b7f0d119b5fcd04441beec5e3412a24641fa1b97d1f7e6a8f408a5445597b4716d771c14705d07ef6466560d3ba5791a3150411f811b27d231a4216e04f334"

RPROVIDES:${PN} += "perl(PCP::LogImport) \
perl-PCP-LogImport \
perl-PCP-LogImport(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpcp3 \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
