SUMMARY = "A Unix shell embedded within Scheme"
DESCRIPTION = "Scsh is a Unix shell embedded in Scheme. It allows the user to write \
commands in a language within Scheme that follows the Unix way, but \
also allows to specify more complex commands with the elegance of \
Scheme."
LICENSE = "BSD-3-Clause"

PV = "0.7+git114432435e4eadd54334df6b37fcae505079b49f"

RPM_NAME = "scsh-base-0.7+git114432435e4eadd54334df6b37fcae505079b49f-7.2.aarch64.rpm"
RPM_HASH = "0865dbb9a3215199de2e92a3459d56d43e863e5f06ad7efd0645478723764dbc319e802a316288421bad990fe1aa79ef7800a282defe8f0623836f91e0fb7977"

RPROVIDES:${PN} += "scsh-base \
scsh-base(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
scheme48-vm"

inherit rpm
