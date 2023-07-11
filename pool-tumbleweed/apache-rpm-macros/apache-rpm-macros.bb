SUMMARY = "Apache RPM Macros"
DESCRIPTION = "RPM Macros intended for Apache modules spec files."
LICENSE = "Apache-2.0"

PV = "20201124"

RPM_NAME = "apache-rpm-macros-20201124-1.11.aarch64.rpm"
RPM_HASH = "d7e6c3156e5ce33f374d57ef4d33503fdc87913b50cead71711588edfc1e70528579b4aa5598d32813b3c81665cd1fd3966bca6e3f4d38b9df3081813f1892ff"

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
