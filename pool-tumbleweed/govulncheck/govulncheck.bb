SUMMARY = "CLI tool to report known CVE vulnerabilities in Go source code and binaries"
DESCRIPTION = "govulncheck is a CLI tool to report known vulnerabilities that affect Go code. It uses static analysis of source code or a binary's symbol table to narrow down reports to only those that could affect the application. \
 \
By default, govulncheck makes requests to the Go vulnerability database at https://vuln.go.dev. Requests to the vulnerability database contain only module paths, not code or other properties of your program. See https://vuln.go.dev/privacy.html for more. Use the -db flag to specify a different database, which must implement the specification at https://go.dev/security/vuln/database."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "govulncheck-1.0.0-1.1.aarch64.rpm"
RPM_HASH = "780043c2134ebfedbc579081f256454d52018b16555714ac8d540735435094fc7d46c7064f2693954e65476a070d2aa2cac124d0dd6ed6c13e22e4c8ac3282bc"

RPROVIDES:${PN} += "govulncheck"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
