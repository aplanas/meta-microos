SUMMARY = "CLI tool and REPL for working with binary data inspired by jq"
DESCRIPTION = "fq is inspired by the well known jq tool and language and allows you to work \
with binary formats the same way you would using jq. In addition it can present \
data like a hex viewer, transform, slice and concatenate binary data. It also \
supports nested formats and has an interactive REPL with auto-completion."
LICENSE = "MIT"

PV = "0.0.10"

RPM_NAME = "fq-0.0.10-1.5.aarch64.rpm"
RPM_HASH = "863962849c8b4d950ad20a06b3e6c642cf5ee5c38b1aac471b4dd6cd585a7ef3c7887cf2ec789b243cffa5b6b0bae91170679cdf46a4018af7c5bc68d349a80a"

RPROVIDES:${PN} += "fq"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
