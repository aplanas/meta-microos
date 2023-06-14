SUMMARY = "Red Datasets provides classes that provide common datasets such as"
DESCRIPTION = "You can use datasets easily because you can access each dataset with multiple \
ways such as `#each` and Apache Arrow Record Batch."
LICENSE = "MIT"

PV = "0.1.5"

RPM_NAME = "ruby3.2-rubygem-red-datasets-0.1.5-1.5.aarch64.rpm"
RPM_HASH = "d114432eafdc819af57d357d8e4699e10f18ad9d1a6da215791a33cbe76d739dfe0162376064442990a9777dc209d57c582e5690069ebf19c908657dd48e59fb"

RPROVIDES:${PN} += "ruby3.2-rubygem-red-datasets \
rubygem-red-datasets \
rubygem-ruby-3.2.0-red-datasets \
rubygem-ruby-3.2.0-red-datasets-0 \
rubygem-ruby-3.2.0-red-datasets-0.1 \
rubygem-ruby-3.2.0-red-datasets-0.1.5"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-csv \
rubygem-ruby-3.2.0-rexml \
rubygem-ruby-3.2.0-rubyzip"

inherit rpm
