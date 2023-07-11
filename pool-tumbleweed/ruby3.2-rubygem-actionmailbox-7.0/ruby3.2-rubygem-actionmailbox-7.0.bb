SUMMARY = "Inbound email handling framework"
DESCRIPTION = "Receive and process incoming emails in Rails applications."
LICENSE = "MIT"

PV = "7.0.5.1"

RPM_NAME = "ruby3.2-rubygem-actionmailbox-7.0-7.0.5.1-1.1.aarch64.rpm"
RPM_HASH = "0ed80261836131fbe34b108680e84305d795c834772cdeb3c77a960bf0946b2bf5f5de6f657fc3ca8559c3d4cdebbf6b7827a35836be00fc768a89c22f4c034d"

RPROVIDES:${PN} += "ruby3.2-rubygem-actionmailbox-7.0 \
rubygem-actionmailbox \
rubygem-ruby-3.2.0-actionmailbox \
rubygem-ruby-3.2.0-actionmailbox-7 \
rubygem-ruby-3.2.0-actionmailbox-7.0 \
rubygem-ruby-3.2.0-actionmailbox-7.0.5"

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
