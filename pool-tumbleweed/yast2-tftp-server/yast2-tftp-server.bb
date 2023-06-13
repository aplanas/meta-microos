SUMMARY = "YaST2 - TFTP Server Configuration"
DESCRIPTION = "The YaST2 component for configuring a TFTP server. TFTP stands for \
Trivial File Transfer Protocol. It is used for booting over the \
network."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-tftp-server-4.6.0-1.1.noarch.rpm"
RPM_HASH = "5a628b1478805143e8634efb1393c5c169e034980644fa3f5982ee226ba82729f63e80d0a19ee7be088867a789ff3a7932c79eac4329b46a78eeb140710adefa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.TFTPServer.desktop) \
metainfo() \
metainfo(org.opensuse.yast.TFTPServer.metainfo.xml) \
yast2-tftp-server"

RDEPENDS:${PN} += "augeas-lenses \
lsof \
rubygem(ruby:3.2.0:cfa) \
yast2 \
yast2-journal \
yast2-ruby-bindings"

inherit rpm
