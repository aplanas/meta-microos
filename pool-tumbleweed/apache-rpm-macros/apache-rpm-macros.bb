SUMMARY = "Apache RPM Macros"
DESCRIPTION = "RPM Macros intended for Apache modules spec files."
LICENSE = "Apache-2.0"

PV = "20201124"

RPM_NAME = "apache-rpm-macros-20201124-1.10.aarch64.rpm"
RPM_HASH = "c0ead8ee37330358ab1826c3c44c95a40fac6659aa07e8e75da1b5fbabb4893ec97dbeff4da6da6bba03a1b2ba5a94200eb62072256f41290c9b5b7a57e9191b"

RPROVIDES:${PN} += "apache-rpm-macros \
rpm-macro-apache-access-syntax-version \
rpm-macro-apache-apxs \
rpm-macro-apache-branch \
rpm-macro-apache-cflags \
rpm-macro-apache-datadir \
rpm-macro-apache-group \
rpm-macro-apache-includedir \
rpm-macro-apache-libexecdir \
rpm-macro-apache-localstatedir \
rpm-macro-apache-major \
rpm-macro-apache-mmn \
rpm-macro-apache-pname \
rpm-macro-apache-serverroot \
rpm-macro-apache-suse-maintenance-mmn \
rpm-macro-apache-sysconfdir \
rpm-macro-apache-user \
rpm-macro-apache-version"

RDEPENDS:${PN} += "apache-rpm-macros-control"

inherit rpm
