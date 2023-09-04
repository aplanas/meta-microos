SUMMARY = "Agama Installer Service"
DESCRIPTION = "System service for Agama, an experimental YaST-based installer."
LICENSE = "GPL-2.0-only"

PV = "3.devel43"

RPM_NAME = "ruby3.2-rubygem-agama-3.devel43-1.1.aarch64.rpm"
RPM_HASH = "efa7304491f7226218028678ef651f3c5d8a86a7e9ec69c61ccd1f466ff8f5b6680ef5574158c6c80033335ab9493009b4848a9bdbb90e82986253f42ceb0ba0"

RPROVIDES:${PN} += "config-ruby3.2-rubygem-agama \
ruby3.2-rubygem-agama \
rubygem-agama \
rubygem-ruby-3.2.0-agama \
rubygem-ruby-3.2.0-agama-3 \
rubygem-ruby-3.2.0-agama-3.devel43"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
/usr/bin/sh \
dbus-1-common \
open-iscsi \
ruby-abi \
rubygem-ruby-3.2.0-cfa-1.0 \
rubygem-ruby-3.2.0-cfa-grub2-2.0 \
rubygem-ruby-3.2.0-cheetah-1.0 \
rubygem-ruby-3.2.0-eventmachine-1.2 \
rubygem-ruby-3.2.0-fast-gettext-2.2 \
rubygem-ruby-3.2.0-nokogiri-1.13 \
rubygem-ruby-3.2.0-rexml-3.2 \
rubygem-ruby-3.2.0-ruby-dbus \
snapper \
update-alternatives \
yast2 \
yast2-bootloader \
yast2-country \
yast2-hardware-detection \
yast2-installation \
yast2-iscsi-client \
yast2-network \
yast2-proxy \
yast2-storage-ng \
yast2-users"

inherit rpm
