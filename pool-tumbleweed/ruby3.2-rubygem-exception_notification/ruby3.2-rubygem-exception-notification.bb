SUMMARY = "Exception notification for Rails apps"
DESCRIPTION = "Exception notification for Rails apps."
LICENSE = "MIT"

PV = "4.5.0"

RPM_NAME = "ruby3.2-rubygem-exception_notification-4.5.0-1.9.aarch64.rpm"
RPM_HASH = "48651648005843c475b316a5a2a51489ec6476cfb0ed417ea498b24e3d6a8d5503533f74a0fb1482b39fcad89c7513474e0c12838797e40825ffe7842cb7f407"

RPROVIDES:${PN} += "ruby3.2-rubygem-exception_notification \
ruby3.2-rubygem-exception_notification(aarch-64) \
rubygem(exception_notification) \
rubygem(ruby:3.2.0:exception_notification) \
rubygem(ruby:3.2.0:exception_notification:4) \
rubygem(ruby:3.2.0:exception_notification:4.5) \
rubygem(ruby:3.2.0:exception_notification:4.5.0)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:actionmailer) \
rubygem(ruby:3.2.0:activesupport)"

inherit rpm
