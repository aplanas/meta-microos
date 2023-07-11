SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.16.15"

RPM_NAME = "go1.16-doc-1.16.15-6.2.aarch64.rpm"
RPM_HASH = "89bd2171761337431f43a06b20fc4fff8f9eff53f84be83a4ac85519b81a504a9db129c11e15dde56fde3cfca0e663c3e067a2885b79d5e9df35fbac986d5bef"

RPROVIDES:${PN} += "go-doc \
go1.16-doc"

RDEPENDS:${PN} += "go1.16"

inherit rpm
