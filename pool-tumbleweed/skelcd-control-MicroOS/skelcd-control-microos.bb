SUMMARY = "The MicroOS control file needed for installation"
DESCRIPTION = "The package contains the MicroOS control file needed for installation."
LICENSE = "MIT"

PV = "20230125"

RPM_NAME = "skelcd-control-MicroOS-20230125-1.2.aarch64.rpm"
RPM_HASH = "8f61721c710730c207b1df43d274158559ffd62371f61be43f843f38e6500d135352cd1e69c72c4c3603cc32353112d956f4eb38b0804b3243d0e3cb71afff74"

RPROVIDES:${PN} += "product_control \
skelcd-control-MicroOS \
skelcd-control-MicroOS(aarch-64)"
RDEPENDS:${PN} += "autoyast2 \
kdump \
rubygem(ruby:3.2.0:byebug) \
yast2-add-on \
yast2-buildtools \
yast2-caasp \
yast2-devtools \
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
yast2-rdp \
yast2-services-manager \
yast2-slp \
yast2-theme \
yast2-trans-stats \
yast2-tune \
yast2-update \
yast2-users \
yast2-x11"

inherit rpm
