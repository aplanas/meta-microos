SUMMARY = "Devise extension to allow authentication via LDAP"
DESCRIPTION = "Devise extension to allow authentication via LDAP."
LICENSE = "MIT"

PV = "0.8.7"

RPM_NAME = "ruby3.2-rubygem-devise_ldap_authenticatable-0.8.7-1.15.aarch64.rpm"
RPM_HASH = "8750f0bfe529489c057a2e503fd344cba5377fdca941be287b9fdbdecebc3a3005bf106c6cb24a1a3bf62c5bc4a07b55fbcbb6daec17e7e9bce20d23c18794c9"

RPROVIDES:${PN} += "ruby3.2-rubygem-devise-ldap-authenticatable \
rubygem-devise-ldap-authenticatable \
rubygem-ruby-3.2.0-devise-ldap-authenticatable \
rubygem-ruby-3.2.0-devise-ldap-authenticatable-0 \
rubygem-ruby-3.2.0-devise-ldap-authenticatable-0.8 \
rubygem-ruby-3.2.0-devise-ldap-authenticatable-0.8.7"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-devise \
rubygem-ruby-3.2.0-net-ldap"

inherit rpm
