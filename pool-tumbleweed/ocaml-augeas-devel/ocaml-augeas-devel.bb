SUMMARY = "Development files for ocaml-augeas"
DESCRIPTION = "The ocaml-augeas-devel package contains libraries and signature files for \
developing applications that use ocaml-augeas."
LICENSE = "GPL-2.0-or-later"

PV = "0.6"

RPM_NAME = "ocaml-augeas-devel-0.6-1.3.aarch64.rpm"
RPM_HASH = "fbde0605342a6b3025d757bd54974b6ff05fac4a734ee73a5ffc2ee3d752e26e01cc5b8c5f0e16c6dc0a6a9818f0a7f5211a4ea3a1d2d9159bb4947c26614f0e"

RPROVIDES:${PN} += "ocaml-augeas-devel \
ocaml-augeas-devel(aarch-64)"

RDEPENDS:${PN} += "ocaml-augeas"

inherit rpm
