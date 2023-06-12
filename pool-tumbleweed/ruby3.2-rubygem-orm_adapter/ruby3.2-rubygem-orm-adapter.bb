SUMMARY = "orm_adapter provides a single point of entry for using basic"
DESCRIPTION = "Provides a single point of entry for using basic features of ruby ORMs."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "ruby3.2-rubygem-orm_adapter-0.5.0-4.28.aarch64.rpm"
RPM_HASH = "dd46243c1290c2f13bd74bdaecb98010901d5f404ce6045fa4f6ea8df9521e15eeadd95013674663703597a982f940c55eeed90fe5a5b5cc16f6a5aeac9b380f"

RPROVIDES:${PN} += "ruby3.2-rubygem-orm_adapter \
ruby3.2-rubygem-orm_adapter(aarch-64) \
rubygem(orm_adapter) \
rubygem(ruby:3.2.0:orm_adapter) \
rubygem(ruby:3.2.0:orm_adapter:0) \
rubygem(ruby:3.2.0:orm_adapter:0.5) \
rubygem(ruby:3.2.0:orm_adapter:0.5.0)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
