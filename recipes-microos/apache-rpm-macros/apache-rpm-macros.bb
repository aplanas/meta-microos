SUMMARY = "Apache RPM Macros"
DESCRIPTION = "RPM Macros intended for Apache modules spec files."
LICENSE = "Apache-2.0"

PV = "20201124"

RPM_NAME = "apache-rpm-macros-20201124-1.10.aarch64.rpm"
RPM_HASH = "c0ead8ee37330358ab1826c3c44c95a40fac6659aa07e8e75da1b5fbabb4893ec97dbeff4da6da6bba03a1b2ba5a94200eb62072256f41290c9b5b7a57e9191b"

RPROVIDES:${PN} += "apache-rpm-macros apache-rpm-macros(aarch-64) rpm_macro(apache_access_syntax_version) rpm_macro(apache_apxs) rpm_macro(apache_branch) rpm_macro(apache_cflags) rpm_macro(apache_datadir) rpm_macro(apache_group) rpm_macro(apache_includedir) rpm_macro(apache_libexecdir) rpm_macro(apache_localstatedir) rpm_macro(apache_major) rpm_macro(apache_mmn) rpm_macro(apache_pname) rpm_macro(apache_serverroot) rpm_macro(apache_suse_maintenance_mmn) rpm_macro(apache_sysconfdir) rpm_macro(apache_user) rpm_macro(apache_version)"
RDEPENDS:${PN} += "apache-rpm-macros-control"

inherit rpm
