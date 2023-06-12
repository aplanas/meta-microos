SUMMARY = "A release management tool"
DESCRIPTION = "Reltool is a release management tool. It analyses a given \
Erlang/OTP installation and determines various dependencies \
between applications. The graphical frontend depicts the \
dependencies and enables interactive customization of a \
target system. The backend provides a batch interface \
for generation of customized target systems."
LICENSE = "Apache-2.0"

PV = "25.3.2"

RPM_NAME = "erlang-reltool-25.3.2-1.1.aarch64.rpm"
RPM_HASH = "b2a777715fb7ea394fcd249441f73e67ca750a8e4c35787439812c0454d82fb1503d49eaaf7b48c5d2e1f4073e7b4596b4d1f416e90fba18a7cb47ab77701a60"

RPROVIDES:${PN} += "erlang-reltool \
erlang-reltool(aarch-64)"
RDEPENDS:${PN} += "erlang \
erlang-wx"

inherit rpm
