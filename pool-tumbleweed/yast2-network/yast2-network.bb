SUMMARY = "YaST2 - Network Configuration"
DESCRIPTION = "This package contains the YaST2 component for network configuration."
LICENSE = "GPL-2.0-only"

PV = "4.6.5"

RPM_NAME = "yast2-network-4.6.5-1.1.noarch.rpm"
RPM_HASH = "c34acdf89c6c16a464d6930b099958e1b92062c1c1ff11a4f0653f233e66b794efa3d1a070d161014bc451f1ba72e3072da54c6e100c176277b3f1c40160868f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-network \
yast2-network-devel-doc"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/rm \
augeas-lenses \
hostname \
hwinfo \
rubygem-ruby-3.2.0-cfa \
sysconfig \
yast2 \
yast2-packager \
yast2-proxy \
yast2-ruby-bindings \
yast2-storage-ng \
yast2-xml"

inherit rpm
