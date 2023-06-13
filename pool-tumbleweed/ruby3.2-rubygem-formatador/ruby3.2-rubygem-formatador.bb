SUMMARY = "STDOUT text formatting"
DESCRIPTION = "Ruby STDOUT text formatting"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ruby3.2-rubygem-formatador-1.1.0-4.5.aarch64.rpm"
RPM_HASH = "6f9a10843f2e91cbbb82776ae6aa3fc500eb6d4f8d2e94d93fcf4951c4330b2f118916e0471f6007ea6acfbe320b12ffa28841d26db6dba4c8549b20722bdf8b"

RPROVIDES:${PN} += "ruby3.2-rubygem-formatador \
ruby3.2-rubygem-formatador(aarch-64) \
rubygem(formatador) \
rubygem(ruby:3.2.0:formatador) \
rubygem(ruby:3.2.0:formatador:1) \
rubygem(ruby:3.2.0:formatador:1.1) \
rubygem(ruby:3.2.0:formatador:1.1.0)"

RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
