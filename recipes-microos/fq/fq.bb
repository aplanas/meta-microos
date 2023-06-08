SUMMARY = "CLI tool and REPL for working with binary data inspired by jq"
DESCRIPTION = "fq is inspired by the well known jq tool and language and allows you to work \
with binary formats the same way you would using jq. In addition it can present \
data like a hex viewer, transform, slice and concatenate binary data. It also \
supports nested formats and has an interactive REPL with auto-completion."
LICENSE = "MIT"

PV = "0.0.10"

RPM_NAME = "fq-0.0.10-1.3.aarch64.rpm"
RPM_HASH = "a1eb783fdd425fce2676f50d9077b9e14253b841bf0d43fa3150dd4c4d292352c6439d7945752e024b74f6ec2c29c6ed80f52ad778f7ae9d95348b571bd916cc"

RPROVIDES:${PN} += "fq fq(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
