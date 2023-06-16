SUMMARY = "Script for Apache HTTPD Runnable Examples"
DESCRIPTION = "Runnable examples for Apache HTTP server. Can be used starting \
point for examples, testcases and other inspiration."
LICENSE = "Apache-2.0"

PV = "20211102"

RPM_NAME = "apache-rex-20211102-1.5.noarch.rpm"
RPM_HASH = "a44dffd806e7e34a0d6fb3d6f1bd1f1a73ab9adc4987a09f9d5d2a34b1d83625b9f578dc96d3e2170ffbe37d963036e1143e555d8f939f713a02be1aeb02e363"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-rex \
rpm-macro-apache-rex-check \
rpm-macro-apache-rex-deps"

RDEPENDS:${PN} += "/usr/bin/bash \
apache2-devel \
apache2-utils \
curl \
lsof \
openssl \
openssl-devel"

inherit rpm
