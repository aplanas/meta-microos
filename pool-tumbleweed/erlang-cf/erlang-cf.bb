SUMMARY = "A helper library for termial colour printing for Erlang"
DESCRIPTION = "A helper library for termial colour printing extending the io:format syntax to add colours."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "erlang-cf-0.3.1-1.2.aarch64.rpm"
RPM_HASH = "61c516f334a3ff0bd7c66db844c2baa25543bab569a9121e0565f6d39d6e5c00c74ff3550b4494f80af7d0357c7574866444ac755698c2b46fabe20b9df29318"

RPROVIDES:${PN} += "erlang-cf"

RDEPENDS:${PN} += "erlang"

inherit rpm
