SUMMARY = "Tool for building and distributing virtualized development environments"
DESCRIPTION = "Vagrant is a tool for building and distributing virtualized development \
environments."
LICENSE = "MIT"

PV = "2.3.7"

RPM_NAME = "vagrant-2.3.7-1.1.noarch.rpm"
RPM_HASH = "848871f67a06c17b19c8c59da7e0b598fcb8167ed4d36e203857d46001e35041823d9c53414ee83af0edaa2388974c75972bff2a6bc5301aa0aed2ef0c9347d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-macro-gem-binary \
rpm-macro-vagrant-dir \
rpm-macro-vagrant-embedded-dir \
rpm-macro-vagrant-plugin-cache \
rpm-macro-vagrant-plugin-conf \
rpm-macro-vagrant-plugin-dir \
rpm-macro-vagrant-plugin-docdir \
rpm-macro-vagrant-plugin-install \
rpm-macro-vagrant-plugin-instdir \
rpm-macro-vagrant-plugin-libdir \
rpm-macro-vagrant-plugin-spec \
rpm-macro-vagrant-rb-build-abi \
rpm-macro-vagrant-rb-build-versions \
rpm-macro-vagrant-rb-ruby-suffix \
rubygem-vagrant \
vagrant"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/ruby.ruby3.2 \
/usr/bin/sh \
bsdtar \
curl \
openssh \
rubygem-ruby-3.2.0-bcrypt-pbkdf-1 \
rubygem-ruby-3.2.0-childprocess-4.1 \
rubygem-ruby-3.2.0-ed25519-1.3 \
rubygem-ruby-3.2.0-erubi \
rubygem-ruby-3.2.0-googleapis-common-protos-types-1 \
rubygem-ruby-3.2.0-grpc \
rubygem-ruby-3.2.0-hashicorp-checkpoint-0.1 \
rubygem-ruby-3.2.0-i18n-1 \
rubygem-ruby-3.2.0-listen-3 \
rubygem-ruby-3.2.0-log4r-1.1 \
rubygem-ruby-3.2.0-mime-types-3 \
rubygem-ruby-3.2.0-net-scp-4 \
rubygem-ruby-3.2.0-net-sftp-4 \
rubygem-ruby-3.2.0-net-ssh-7 \
rubygem-ruby-3.2.0-rb-kqueue-0.2 \
rubygem-ruby-3.2.0-rexml-3 \
rubygem-ruby-3.2.0-rgl-0.5 \
rubygem-ruby-3.2.0-rubyzip-2 \
rubygem-ruby-3.2.0-vagrant-cloud-3.0 \
rubygem-ruby-3.2.0-winrm-2 \
rubygem-ruby-3.2.0-winrm-elevated-1 \
rubygem-ruby-3.2.0-winrm-fs-1 \
shadow"

inherit rpm
