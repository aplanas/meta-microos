SUMMARY = "Create and manage complex tmux sessions easily"
DESCRIPTION = "Create and manage complex tmux sessions easily."
LICENSE = "MIT"

PV = "3.0.5"

RPM_NAME = "ruby3.2-rubygem-tmuxinator-3.0.5-1.7.aarch64.rpm"
RPM_HASH = "7e5a4b50e5414d4f654ad4a44dcdcc1e4e29a82246baabcbc3d77a45e203514c0b7047ff7bfc92da83ec613ab6ca4b10e95c6976372ee01a4ccfe3a677e86c2e"

RPROVIDES:${PN} += "ruby3.2-rubygem-tmuxinator \
ruby3.2-rubygem-tmuxinator(aarch-64) \
rubygem(ruby:3.2.0:tmuxinator) \
rubygem(ruby:3.2.0:tmuxinator:3) \
rubygem(ruby:3.2.0:tmuxinator:3.0) \
rubygem(ruby:3.2.0:tmuxinator:3.0.5) \
rubygem(tmuxinator)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby(abi) \
rubygem(ruby:3.2.0:erubis:2) \
rubygem(ruby:3.2.0:thor:1.2) \
rubygem(ruby:3.2.0:xdg) \
rubygem(ruby:3.2.0:xdg:2) \
update-alternatives"

inherit rpm
