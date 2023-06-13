SUMMARY = "A VirtualBox client with remote management"
DESCRIPTION = "VirtualBox is traditionally considered to be a virtualization solution aimed \
at the desktop as opposed to other solutions such as KVM, Xen and VMWare ESX \
which are considered more server orientated solutions. While it is certainly \
possible to install VirtualBox on a server, it offers few remote management \
features beyond using the vboxmanage command line. RemoteBox aims to fill \
this gap by providing a graphical VirtualBox client which is able to \
communicate with and manage a VirtualBox server installation."
LICENSE = "GPL-2.0-or-later"

PV = "3.2"

RPM_NAME = "RemoteBox-3.2-1.1.noarch.rpm"
RPM_HASH = "071d41b6888219bccff3387dd11c911c883d941ffe76cb3c21bf68f40e7ceb6b24ac06c7bb507317ea546bd78fd4c9eaf0aa2d5abca4b753f219ff76e6b9f1e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "RemoteBox \
application() \
application(RemoteBox.desktop) \
metainfo() \
metainfo(RemoteBox.appdata.xml)"

RDEPENDS:${PN} += "/usr/bin/perl \
freerdp \
perl-Gtk3 \
perl-SOAP-Lite \
typelib-1_0-GdkPixdata-2_0 \
xdg-utils"

inherit rpm
