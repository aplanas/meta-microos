SUMMARY = "Static analysis tool for securing Go code"
DESCRIPTION = "GoKart is a static analysis tool for Go that finds vulnerabilities using the \
SSA (single static assignment) form of Go source code. It is capable of tracing \
the source of variables and function arguments to determine whether input \
sources are safe, which reduces the number of false positives compared to \
other Go security scanners. For instance, a SQL query that is concatenated \
with a variable might traditionally be flagged as SQL injection; however, \
GoKart can figure out if the variable is actually a constant or constant \
equivalent, in which case there is no vulnerability."
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "gokart-0.5.1-1.5.aarch64.rpm"
RPM_HASH = "2fcec0fead9835e1597b03560722935040ced4162854b57d90c3f882714b1f5c95b32faced64cc532785bb6c34b9e05fddd1fcb90d2e872f2b1b7c6ceeb3400a"

RPROVIDES:${PN} += "gokart"

RDEPENDS:${PN} += "go \
libc.so.6"

inherit rpm
