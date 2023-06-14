SUMMARY = "OpenStack Packaging - RPM Macros"
DESCRIPTION = "This package provides OpenStack RPM macros. You need it to build OpenStack \
packages."
LICENSE = "Apache-2.0"

PV = "2020.1.2"

RPM_NAME = "openstack-macros-2020.1.2-3.1.noarch.rpm"
RPM_HASH = "c1b9acb3dce3f7d09436701ff753f9cc37eee129b592759270b080a52452d2dd3d7dcc6922ac25ffd752835abedffa91927e368efbec48b9340556738bb8c784"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openstack-macros \
rpm-macro--defaultlicensedir \
rpm-macro-apache-conf-dir \
rpm-macro-apache-group \
rpm-macro-apache-name \
rpm-macro-apache-site-dir \
rpm-macro-apache-user \
rpm-macro-gpgverify \
rpm-macro-http-dashboard-dir \
rpm-macro-openstack-pre-user-group-create \
rpm-macro-openstack-stestr-run \
rpm-macro-openstack-test-package-dir \
rpm-macro-openstack-test-package-install \
rpm-macro-py-build \
rpm-macro-py-req-cleanup \
rpm-macro-py-setup \
rpm-macro-py-shbang-opts \
rpm-macro-py2-build \
rpm-macro-py2-entrypoint \
rpm-macro-py2-install \
rpm-macro-py2-shbang-opts \
rpm-macro-pycached \
rpm-macro-python2-sitearch \
rpm-macro-python2-sitelib \
rpm-macro-sphinx-build"

RDEPENDS:${PN} += ""

inherit rpm
