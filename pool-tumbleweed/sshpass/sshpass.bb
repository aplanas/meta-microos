SUMMARY = "Non-interactive SSH authentication utility"
DESCRIPTION = "Tool for non-interactively performing password authentication with so called \
'interactive keyboard password authentication' of SSH. Most users should use \
more secure public key authentication of SSH instead."
LICENSE = "GPL-2.0-or-later"

PV = "1.10"

RPM_NAME = "sshpass-1.10-1.2.aarch64.rpm"
RPM_HASH = "7c4ec0b787a30ccdfa5ed3c5432d7208d2f9f260fbbd7cf47106847eadb8fa03f830b50c1f124494ff93ed412b0a3e68280f539f6171c11100663a54906ea180"

RPROVIDES:${PN} += "sshpass \
sshpass(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
