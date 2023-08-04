SUMMARY = "Package manager for the Erlang VM"
DESCRIPTION = "Hex is package manager for the Erlang VM. \
 \
This project currently provides tasks that integrate with Mix, Elixir's build tool. \
 \
See http://hex.pm for installation instructions and other documentation."
LICENSE = "Apache-2.0"

PV = "2.0.6"

RPM_NAME = "elixir-hex-2.0.6-1.1.noarch.rpm"
RPM_HASH = "28aca8e118a71ef5209638d10fef45661f73b05a985bbbcdfb18466e8aec3fda660d5b3dba65f07c061e0c6a8f17abada07352ee14b66a40ea944a7150ff86f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elixir-hex"

RDEPENDS:${PN} += "elixir"

inherit rpm
