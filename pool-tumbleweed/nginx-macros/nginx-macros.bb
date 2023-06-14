SUMMARY = "Just some macros to make packaging nginx and modules easier"
DESCRIPTION = "Just some macros to make packaging nginx and modules easier."
LICENSE = "BSD-2-Clause"

PV = "0.0.1"

RPM_NAME = "nginx-macros-0.0.1-3.7.noarch.rpm"
RPM_HASH = "7c4580e9475b7cf454596f28562c4dbbebcd12e68a26634a78e2fab45ba44182c541233d041bdf9223d349f7c9baae6527ea9803e2b952c5312b66a484861968"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nginx-macros \
rpm-macro-ngx-access-log \
rpm-macro-ngx-conditionals \
rpm-macro-ngx-conf-dir \
rpm-macro-ngx-conf-path \
rpm-macro-ngx-configure \
rpm-macro-ngx-doc-dir \
rpm-macro-ngx-error-log \
rpm-macro-ngx-home \
rpm-macro-ngx-lock-path \
rpm-macro-ngx-log-dir \
rpm-macro-ngx-module-dir \
rpm-macro-ngx-pid-path \
rpm-macro-ngx-prefix \
rpm-macro-ngx-requires \
rpm-macro-ngx-sbin-path \
rpm-macro-ngx-tmp-fcgi \
rpm-macro-ngx-tmp-http \
rpm-macro-ngx-tmp-proxy \
rpm-macro-ngx-tmp-scgi \
rpm-macro-ngx-tmp-uwsgi \
rpm-macro-ngx-user-group"

RDEPENDS:${PN} += ""

inherit rpm
