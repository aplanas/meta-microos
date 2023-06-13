SUMMARY = "Just some macros to make packaging nginx and modules easier"
DESCRIPTION = "Just some macros to make packaging nginx and modules easier."
LICENSE = "BSD-2-Clause"

PV = "0.0.1"

RPM_NAME = "nginx-macros-0.0.1-3.7.noarch.rpm"
RPM_HASH = "7c4580e9475b7cf454596f28562c4dbbebcd12e68a26634a78e2fab45ba44182c541233d041bdf9223d349f7c9baae6527ea9803e2b952c5312b66a484861968"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nginx-macros \
rpm_macro(ngx_access_log) \
rpm_macro(ngx_conditionals) \
rpm_macro(ngx_conf_dir) \
rpm_macro(ngx_conf_path) \
rpm_macro(ngx_configure) \
rpm_macro(ngx_doc_dir) \
rpm_macro(ngx_error_log) \
rpm_macro(ngx_home) \
rpm_macro(ngx_lock_path) \
rpm_macro(ngx_log_dir) \
rpm_macro(ngx_module_dir) \
rpm_macro(ngx_pid_path) \
rpm_macro(ngx_prefix) \
rpm_macro(ngx_requires) \
rpm_macro(ngx_sbin_path) \
rpm_macro(ngx_tmp_fcgi) \
rpm_macro(ngx_tmp_http) \
rpm_macro(ngx_tmp_proxy) \
rpm_macro(ngx_tmp_scgi) \
rpm_macro(ngx_tmp_uwsgi) \
rpm_macro(ngx_user_group)"

RDEPENDS:${PN} += ""

inherit rpm
