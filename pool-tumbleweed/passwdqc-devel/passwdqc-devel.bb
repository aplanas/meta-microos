SUMMARY = "Useful collection of routines for C and C++ programming"
DESCRIPTION = "libpasswdqc is a simple password strength checking library. \
In addition to checking regular passwords, it offers support for passphrases \
and can provide randomly generated ones."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "passwdqc-devel-1.4.0-2.8.aarch64.rpm"
RPM_HASH = "a078d00410a77feb85d82147b60740e4de06b11a8a8589f5fa88b9119c205a3922a689aa94bb3f5eb4ce2d0ce4d5c18d06a3cf0892f0f841650d890521f7c282"

RPROVIDES:${PN} += "passwdqc-devel"

RDEPENDS:${PN} += "libpasswdqc0"

inherit rpm
