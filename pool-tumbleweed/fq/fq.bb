SUMMARY = "CLI tool and REPL for working with binary data inspired by jq"
DESCRIPTION = "fq is inspired by the well known jq tool and language and allows you to work \
with binary formats the same way you would using jq. In addition it can present \
data like a hex viewer, transform, slice and concatenate binary data. It also \
supports nested formats and has an interactive REPL with auto-completion."
LICENSE = "MIT"

PV = "0.0.10"

RPM_NAME = "fq-0.0.10-1.4.aarch64.rpm"
RPM_HASH = "6b7877206268f7fb0603249e38e45afa79ace570938334c1e2cc022bc06866e015aa6a3814b79858548ef1a34df565cd94a86955c726501ae09d870ded0a3cb4"

RPROVIDES:${PN} += "fq \
fq(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
