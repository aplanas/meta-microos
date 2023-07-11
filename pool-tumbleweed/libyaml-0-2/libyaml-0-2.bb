SUMMARY = "A YAML parser and emitter written in C"
DESCRIPTION = "This package holds the shared library of libyaml."
LICENSE = "MIT"

PV = "0.2.5"

RPM_NAME = "libyaml-0-2-0.2.5-2.4.aarch64.rpm"
RPM_HASH = "2691f173483aa4e62669e1b950bb7e985e53a379d84397194f775705abc33a6bf656a6472d09ebee2176d6fedbec45c3c41829d9851a13631daf231fdf91364a"

RPROVIDES:${PN} += "libyaml-0-2 \
libyaml-0.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
