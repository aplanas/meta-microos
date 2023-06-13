SUMMARY = "Common protocol buffer types used in Google APIs"
DESCRIPTION = "Common protocol buffer types used by Google APIs."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "ruby3.2-rubygem-googleapis-common-protos-types-1.4.0-1.5.aarch64.rpm"
RPM_HASH = "02f08ed9e87f396ca57e2c85cd8cfd9f94235686d6d405089b9ffdc5a8d3af1a76daa5c7e93d6d2f883bda4c67c49b8635e9bef5b6bf65ec2360b5b7d4e08e25"

RPROVIDES:${PN} += "ruby3.2-rubygem-googleapis-common-protos-types \
ruby3.2-rubygem-googleapis-common-protos-types(aarch-64) \
rubygem(googleapis-common-protos-types) \
rubygem(ruby:3.2.0:googleapis-common-protos-types) \
rubygem(ruby:3.2.0:googleapis-common-protos-types:1) \
rubygem(ruby:3.2.0:googleapis-common-protos-types:1.4) \
rubygem(ruby:3.2.0:googleapis-common-protos-types:1.4.0)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:google-protobuf:3)"

inherit rpm
