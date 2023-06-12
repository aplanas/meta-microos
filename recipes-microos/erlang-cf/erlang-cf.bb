SUMMARY = "A helper library for termial colour printing for Erlang"
DESCRIPTION = "A helper library for termial colour printing extending the io:format syntax to add colours."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "erlang-cf-0.3.1-1.1.aarch64.rpm"
RPM_HASH = "0f791207068c14224241646a9deb8c7e0f48e053f2e3260abd64c7ad778fa9dac17627aa0a06b5f52068b1538db8120113bf060d9c314c7c72a259f27c615a72"

RPROVIDES:${PN} += "erlang-cf \
erlang-cf(aarch-64)"
RDEPENDS:${PN} += "erlang"

inherit rpm
