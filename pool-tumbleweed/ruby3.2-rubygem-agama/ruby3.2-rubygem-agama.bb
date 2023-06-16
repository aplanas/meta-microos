SUMMARY = "Agama Installer Service"
DESCRIPTION = "System service for Agama, an experimental YaST-based installer."
LICENSE = "GPL-2.0-only"

PV = "2.1"

RPM_NAME = "ruby3.2-rubygem-agama-2.1-1.1.aarch64.rpm"
RPM_HASH = "0f0e52cfa3f743d02b9aeb5666e6c62a949ab0009bd4e293b3087853233ce0c77c58002af92b5552497c7807be5f43dcdb364abae2e9e506376ac4d0997bb1cc"

RPROVIDES:${PN} += "config-ruby3.2-rubygem-agama \
ruby3.2-rubygem-agama \
rubygem-agama \
rubygem-ruby-3.2.0-agama \
rubygem-ruby-3.2.0-agama-2 \
rubygem-ruby-3.2.0-agama-2.1"

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
rubygem-ruby-3.2.0-ruby-dbus-0.22 \
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
