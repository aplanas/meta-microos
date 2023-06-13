SUMMARY = "Package manager for the Erlang VM"
DESCRIPTION = "Hex is package manager for the Erlang VM. \
 \
This project currently provides tasks that integrate with Mix, Elixir's build tool. \
 \
See http://hex.pm for installation instructions and other documentation."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "elixir-hex-1.0.1-1.4.noarch.rpm"
RPM_HASH = "1a8892231bebae8adea7ec399463354de320725d982cfbc1d9955bb8f9a5518932e02cce18de1372d7c19302f2893287f680134b31ba91e7033c9f67a69219c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elixir-hex"

RDEPENDS:${PN} += "elixir"

inherit rpm
