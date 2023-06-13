SUMMARY = "Library for validating email addresses in Rails 3 models"
DESCRIPTION = "Library for validating email addresses in Rails 3 models."
LICENSE = "MIT"

PV = "0.1.6"

RPM_NAME = "ruby3.2-rubygem-validate_email-0.1.6-1.24.aarch64.rpm"
RPM_HASH = "7214834b84783e4ae348e8fbd5bd261a833301750e677dbccce170730637c0a87690146c95579b64c60c6dfc99b917e1c7fb04ed2377272bc9f03f6019197152"

RPROVIDES:${PN} += "ruby3.2-rubygem-validate_email \
ruby3.2-rubygem-validate_email(aarch-64) \
rubygem(ruby:3.2.0:validate_email) \
rubygem(ruby:3.2.0:validate_email:0) \
rubygem(ruby:3.2.0:validate_email:0.1) \
rubygem(ruby:3.2.0:validate_email:0.1.6) \
rubygem(validate_email)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:activemodel) \
rubygem(ruby:3.2.0:mail)"

inherit rpm
