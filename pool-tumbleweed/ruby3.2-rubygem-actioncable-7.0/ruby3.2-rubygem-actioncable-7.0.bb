SUMMARY = "WebSocket framework for Rails"
DESCRIPTION = "Structure many real-time application concerns into channels over a single \
WebSocket connection."
LICENSE = "MIT"

PV = "7.0.5.1"

RPM_NAME = "ruby3.2-rubygem-actioncable-7.0-7.0.5.1-1.1.aarch64.rpm"
RPM_HASH = "724f960b34698a953e6e96388766c66c64593513c80c42e569b640ff6fe70a02a57461561d8cb17a33c160500501f5ad9dc4534b4e5c8a96e8e32294ee3bee24"

RPROVIDES:${PN} += "ruby3.2-rubygem-actioncable-7.0 \
rubygem-actioncable \
rubygem-ruby-3.2.0-actioncable \
rubygem-ruby-3.2.0-actioncable-7 \
rubygem-ruby-3.2.0-actioncable-7.0 \
rubygem-ruby-3.2.0-actioncable-7.0.5"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-actionpack \
rubygem-ruby-3.2.0-activesupport \
rubygem-ruby-3.2.0-nio4r-2 \
rubygem-ruby-3.2.0-websocket-driver"

inherit rpm
