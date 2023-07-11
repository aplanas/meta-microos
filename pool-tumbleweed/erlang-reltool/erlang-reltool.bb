SUMMARY = "A release management tool"
DESCRIPTION = "Reltool is a release management tool. It analyses a given \
Erlang/OTP installation and determines various dependencies \
between applications. The graphical frontend depicts the \
dependencies and enables interactive customization of a \
target system. The backend provides a batch interface \
for generation of customized target systems."
LICENSE = "Apache-2.0"

PV = "25.3.2.2"

RPM_NAME = "erlang-reltool-25.3.2.2-1.1.aarch64.rpm"
RPM_HASH = "3dc7f9654b9524973ba984320b35de012b7072e5e390821bfc0ffdbf42f9e40b551cb249cafcd32c19316729473be5b0b5fe614c10ebdd72332421d8422c658d"

RPROVIDES:${PN} += "erlang-reltool"

RDEPENDS:${PN} += "erlang \
erlang-wx"

inherit rpm
