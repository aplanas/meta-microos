SUMMARY = "A simple, fast, memory-efficient and threadsafe implementation of"
DESCRIPTION = "A simple, fast, memory-efficient and threadsafe implementation of GetText."
LICENSE = "MIT & Ruby"

PV = "1.1.2"

RPM_NAME = "ruby3.2-rubygem-fast_gettext-1.1-1.1.2-1.17.aarch64.rpm"
RPM_HASH = "ce8e3937d9911ba61a7a506163dff1d5332f91b99b37722710a871a8c15542f7da6b4592966a029d763c77dd30773b7cfd54a5cb9851ddb00fcb322ae69e0c96"

RPROVIDES:${PN} += "ruby3.2-rubygem-fast_gettext-1.1 \
ruby3.2-rubygem-fast_gettext-1.1(aarch-64) \
rubygem(fast_gettext) \
rubygem(ruby:3.2.0:fast_gettext) \
rubygem(ruby:3.2.0:fast_gettext:1) \
rubygem(ruby:3.2.0:fast_gettext:1.1) \
rubygem(ruby:3.2.0:fast_gettext:1.1.2)"

RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
