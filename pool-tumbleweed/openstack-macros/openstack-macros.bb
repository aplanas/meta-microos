SUMMARY = "OpenStack Packaging - RPM Macros"
DESCRIPTION = "This package provides OpenStack RPM macros. You need it to build OpenStack \
packages."
LICENSE = "Apache-2.0"

PV = "2020.1.2"

RPM_NAME = "openstack-macros-2020.1.2-3.1.noarch.rpm"
RPM_HASH = "c1b9acb3dce3f7d09436701ff753f9cc37eee129b592759270b080a52452d2dd3d7dcc6922ac25ffd752835abedffa91927e368efbec48b9340556738bb8c784"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openstack-macros \
rpm_macro(_defaultlicensedir) \
rpm_macro(apache_conf_dir) \
rpm_macro(apache_group) \
rpm_macro(apache_name) \
rpm_macro(apache_site_dir) \
rpm_macro(apache_user) \
rpm_macro(gpgverify) \
rpm_macro(http_dashboard_dir) \
rpm_macro(openstack_pre_user_group_create) \
rpm_macro(openstack_stestr_run) \
rpm_macro(openstack_test_package_dir) \
rpm_macro(openstack_test_package_install) \
rpm_macro(py2_build) \
rpm_macro(py2_entrypoint) \
rpm_macro(py2_install) \
rpm_macro(py2_shbang_opts) \
rpm_macro(py_build) \
rpm_macro(py_req_cleanup) \
rpm_macro(py_setup) \
rpm_macro(py_shbang_opts) \
rpm_macro(pycached) \
rpm_macro(python2_sitearch) \
rpm_macro(python2_sitelib) \
rpm_macro(sphinx_build)"

RDEPENDS:${PN} += ""

inherit rpm
