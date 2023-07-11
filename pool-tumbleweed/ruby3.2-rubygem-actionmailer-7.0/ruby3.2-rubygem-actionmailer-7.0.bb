SUMMARY = "Email composition and delivery framework (part of Rails)"
DESCRIPTION = "Email on Rails. Compose, deliver, and test emails using the familiar \
controller/view pattern. First-class support for multipart email and \
attachments."
LICENSE = "MIT"

PV = "7.0.5.1"

RPM_NAME = "ruby3.2-rubygem-actionmailer-7.0-7.0.5.1-1.1.aarch64.rpm"
RPM_HASH = "f6cf83d1e4c73fcd53a2ba31b3bcc0c00d986095770e7f1af8af218989ab9a199f3098c5df451fc7b896bdeaf0c22e6595251ab1c05561b9a1c8559805f52f34"

RPROVIDES:${PN} += "ruby3.2-rubygem-actionmailer-7.0 \
rubygem-actionmailer \
rubygem-ruby-3.2.0-actionmailer \
rubygem-ruby-3.2.0-actionmailer-7 \
rubygem-ruby-3.2.0-actionmailer-7.0 \
rubygem-ruby-3.2.0-actionmailer-7.0.5"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-actionpack \
rubygem-ruby-3.2.0-actionview \
rubygem-ruby-3.2.0-activejob \
rubygem-ruby-3.2.0-activesupport \
rubygem-ruby-3.2.0-mail \
rubygem-ruby-3.2.0-mail-2 \
rubygem-ruby-3.2.0-net-imap \
rubygem-ruby-3.2.0-net-pop \
rubygem-ruby-3.2.0-net-smtp \
rubygem-ruby-3.2.0-rails-dom-testing-2"

inherit rpm
