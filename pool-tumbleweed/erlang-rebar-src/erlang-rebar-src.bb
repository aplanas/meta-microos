SUMMARY = "A sophisticated build-tool for Erlang projects that follows OTP principles"
DESCRIPTION = "rebar is an Erlang build tool that makes it easy to compile and \
test Erlang applications, port drivers and releases."
LICENSE = "Apache-2.0"

PV = "2.6.4+git20180201.b6d3094"

RPM_NAME = "erlang-rebar-src-2.6.4+git20180201.b6d3094-3.7.aarch64.rpm"
RPM_HASH = "226d9a62e620764abfc4f57940ef497409b557a081c8eb379323090bfb6409b01c32b71e0f4fd4febb979deb84fe098efc4aa6bd4507ec14fc4314169a0df5de"

RPROVIDES:${PN} += "erlang-rebar-devel \
erlang-rebar-src"

RDEPENDS:${PN} += "erlang-rebar"

inherit rpm
