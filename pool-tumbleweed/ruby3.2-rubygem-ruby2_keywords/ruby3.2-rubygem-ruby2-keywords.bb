SUMMARY = "Shim library for Module#ruby2_keywords"
DESCRIPTION = "Shim library for Module#ruby2_keywords."
LICENSE = "BSD-2-Clause & Ruby"

PV = "0.0.5"

RPM_NAME = "ruby3.2-rubygem-ruby2_keywords-0.0.5-1.11.aarch64.rpm"
RPM_HASH = "458ed8d2ddd7adf4de998adfc30e5d47717b6dc04e1afd48d69f3b0a5eaec0d00e4b08e62472c89c27b838b9459e9b999500a86a274f28666ea88519b36f93f2"

RPROVIDES:${PN} += "ruby3.2-rubygem-ruby2-keywords \
rubygem-ruby-3.2.0-ruby2-keywords \
rubygem-ruby-3.2.0-ruby2-keywords-0 \
rubygem-ruby-3.2.0-ruby2-keywords-0.0 \
rubygem-ruby-3.2.0-ruby2-keywords-0.0.5 \
rubygem-ruby2-keywords"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
