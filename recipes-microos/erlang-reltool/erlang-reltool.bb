SUMMARY = "A release management tool"
DESCRIPTION = "Reltool is a release management tool. It analyses a given \
Erlang/OTP installation and determines various dependencies \
between applications. The graphical frontend depicts the \
dependencies and enables interactive customization of a \
target system. The backend provides a batch interface \
for generation of customized target systems."
LICENSE = "Apache-2.0"

PV = "25.3"

RPM_NAME = "erlang-reltool-25.3-1.1.aarch64.rpm"
RPM_HASH = "1f68cea362be15de684a15ae7bf89d48bdfbee60350cabf15aaa482415279e1e33838f38e1b8b84ff3512936aa80e2fe329209bd7ecba8a64681397ed073d92b"

RPROVIDES:${PN} += "erlang-reltool erlang-reltool(aarch-64)"
RDEPENDS:${PN} += "erlang erlang-wx"

inherit rpm
