SUMMARY = "A simple, fast, memory-efficient and threadsafe implementation of"
DESCRIPTION = "A simple, fast, memory-efficient and threadsafe implementation of GetText."
LICENSE = "MIT & Ruby"

PV = "2.2.0"

RPM_NAME = "ruby3.2-rubygem-fast_gettext-2.2.0-1.9.aarch64.rpm"
RPM_HASH = "75ecc1d271b0109c16706a2471e5604dc6943d91f5d1a5db9fcaecd8c9a5693c2ae144d6f22023bfb155821efe37f24a4d6c9b65a8061584d8983edb231ba2b0"

RPROVIDES:${PN} += "ruby3.2-rubygem-fast_gettext \
ruby3.2-rubygem-fast_gettext(aarch-64) \
rubygem(fast_gettext) \
rubygem(ruby:3.2.0:fast_gettext) \
rubygem(ruby:3.2.0:fast_gettext:2) \
rubygem(ruby:3.2.0:fast_gettext:2.2) \
rubygem(ruby:3.2.0:fast_gettext:2.2.0)"

RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
