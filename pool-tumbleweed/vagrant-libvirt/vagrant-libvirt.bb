SUMMARY = "Vagrant provider for libvirt"
DESCRIPTION = "This is a Vagrant plugin that adds a Libvirt provider to Vagrant, allowing \
Vagrant to control and provision machines via the Libvirt toolkit."
LICENSE = "MIT"

PV = "0.11.2"

RPM_NAME = "vagrant-libvirt-0.11.2-2.3.aarch64.rpm"
RPM_HASH = "bb9c23ae161c5dbc0f604ffd7a7b1246ce7426e42c446480f1c31fb512c89d17fbacb93dc7a8f4fb486f62aab900b929bdfac781c69b78fda691456283ecafc6"

RPROVIDES:${PN} += "vagrant-libvirt"

RDEPENDS:${PN} += "/usr/bin/sh \
libvirt \
qemu-arm \
rubygem-ruby-3.2.0-diffy \
rubygem-ruby-3.2.0-fog-core-2 \
rubygem-ruby-3.2.0-fog-libvirt \
rubygem-ruby-3.2.0-nokogiri-1 \
rubygem-ruby-3.2.0-rexml \
rubygem-ruby-3.2.0-xml-simple \
vagrant"

inherit rpm
