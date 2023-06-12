SUMMARY = "Hashdiff is a diff lib to compute the smallest difference between"
DESCRIPTION = "Hashdiff is a diff lib to compute the smallest difference between two hashes. \
."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "ruby3.2-rubygem-hashdiff-1.0.1-1.16.aarch64.rpm"
RPM_HASH = "64d8bf58383584d80a8221cedd32234906d3eea254deadcf8ef07356d01a9e4e35af297a78f138201651544d76da98764184d81d8b3f2cff87ebdf88ae368ccd"

RPROVIDES:${PN} += "ruby3.2-rubygem-hashdiff \
ruby3.2-rubygem-hashdiff(aarch-64) \
rubygem(hashdiff) \
rubygem(ruby:3.2.0:hashdiff) \
rubygem(ruby:3.2.0:hashdiff:1) \
rubygem(ruby:3.2.0:hashdiff:1.0) \
rubygem(ruby:3.2.0:hashdiff:1.0.1)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
