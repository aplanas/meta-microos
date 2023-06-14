SUMMARY = "retrieve the sourcecode for a method"
DESCRIPTION = "retrieve the sourcecode for a method."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "ruby3.2-rubygem-method_source-1.0.0-1.17.aarch64.rpm"
RPM_HASH = "c74808281f08df1494411d4fd62afef2a6332a941da4caf6a8f5599e71837e000cd5a8eb71691d583e75ac92fc821b425e7d581618b412cb8d2d45c659e73b79"

RPROVIDES:${PN} += "ruby3.2-rubygem-method-source \
rubygem-method-source \
rubygem-ruby-3.2.0-method-source \
rubygem-ruby-3.2.0-method-source-1 \
rubygem-ruby-3.2.0-method-source-1.0 \
rubygem-ruby-3.2.0-method-source-1.0.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
