SUMMARY = "Refer to any model with a URI: gid://app/class/id"
DESCRIPTION = "URIs for your models makes it easy to pass references around."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ruby3.2-rubygem-globalid-1.1.0-1.3.aarch64.rpm"
RPM_HASH = "e25bef570d13ce4f751142abb2a2feba305f648cf0bc07fc781bdbc386bad8a0ae0b10c03d78077655cf706874b07fdfbd454de762a0518c835fad67c68f7bec"

RPROVIDES:${PN} += "ruby3.2-rubygem-globalid \
rubygem-globalid \
rubygem-ruby-3.2.0-globalid \
rubygem-ruby-3.2.0-globalid-1 \
rubygem-ruby-3.2.0-globalid-1.1 \
rubygem-ruby-3.2.0-globalid-1.1.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-activesupport"

inherit rpm
