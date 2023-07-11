SUMMARY = "Package manager for the Erlang VM"
DESCRIPTION = "Hex is package manager for the Erlang VM. \
 \
This project currently provides tasks that integrate with Mix, Elixir's build tool. \
 \
See http://hex.pm for installation instructions and other documentation."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "elixir-hex-1.0.1-1.5.noarch.rpm"
RPM_HASH = "49ab2b9e2d159981e1d2e802f292596781fd0df4b8b7fdfda78f4a4aef68cf491e15819278c3c4c525048b0e40c03a58f6aad9a906d484530361c22bfcc8cfa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elixir-hex"

RDEPENDS:${PN} += "elixir"

inherit rpm
