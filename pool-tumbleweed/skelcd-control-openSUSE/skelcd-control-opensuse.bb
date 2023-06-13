SUMMARY = "The openSUSE Installation Control file"
DESCRIPTION = "This package contains the control file used for openSUSE installation."
LICENSE = "MIT"

PV = "20230512.1"

RPM_NAME = "skelcd-control-openSUSE-20230512.1-1.1.aarch64.rpm"
RPM_HASH = "32215bf513a5276c698c7f0f1c51f17425c7150d71d728679a3c25007feb12ab191ce134fe4d6691f879416157c9c58dd58327461bba60ec1ebc4d6346c6b16d"

RPROVIDES:${PN} += "product_control \
skelcd-control-openSUSE \
skelcd-control-openSUSE(aarch-64)"

RDEPENDS:${PN} += "autoyast2 \
kdump \
release-notes \
rubygem(ruby:3.2.0:byebug) \
yast2-add-on \
yast2-configuration-management \
yast2-fcoe-client \
yast2-firewall \
yast2-installation \
yast2-iscsi-client \
yast2-kdump \
yast2-multipath \
yast2-network \
yast2-nfs-client \
yast2-ntp-client \
yast2-proxy \
yast2-qt-branding-openSUSE \
yast2-services-manager \
yast2-slp \
yast2-theme \
yast2-trans-stats \
yast2-tune \
yast2-update \
yast2-users \
yast2-x11"

inherit rpm
