SUMMARY = "Inbound email handling framework"
DESCRIPTION = "Receive and process incoming emails in Rails applications."
LICENSE = "MIT"

PV = "7.0.4.3"

RPM_NAME = "ruby3.2-rubygem-actionmailbox-7.0-7.0.4.3-1.1.aarch64.rpm"
RPM_HASH = "9cdb9c83860ddd44eb2224ea3dd90bc78f65cda92c15f7ec56b705f56f554bdb6f9418038589222c7bf2feb8f7180075200edd7a31cc14b7e5210e432c6bf328"

RPROVIDES:${PN} += "ruby3.2-rubygem-actionmailbox-7.0 \
rubygem-actionmailbox \
rubygem-ruby-3.2.0-actionmailbox \
rubygem-ruby-3.2.0-actionmailbox-7 \
rubygem-ruby-3.2.0-actionmailbox-7.0 \
rubygem-ruby-3.2.0-actionmailbox-7.0.4"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-actionpack \
rubygem-ruby-3.2.0-activejob \
rubygem-ruby-3.2.0-activerecord \
rubygem-ruby-3.2.0-activestorage \
rubygem-ruby-3.2.0-activesupport \
rubygem-ruby-3.2.0-mail \
rubygem-ruby-3.2.0-net-imap \
rubygem-ruby-3.2.0-net-pop \
rubygem-ruby-3.2.0-net-smtp"

inherit rpm
