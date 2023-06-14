SUMMARY = "Useful collection of routines for C and C++ programming"
DESCRIPTION = "libpasswdqc is a simple password strength checking library. \
In addition to checking regular passwords, it offers support for passphrases \
and can provide randomly generated ones."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "passwdqc-devel-1.4.0-2.7.aarch64.rpm"
RPM_HASH = "f392656a92ce40cbda049f2f064e7d4f03cafed9965f45cfc44ebdc6ee271b9b876b072a836bd8217ee5f2ee90fb64d7e8848659dfec4831d657a4b58be4450f"

RPROVIDES:${PN} += "passwdqc-devel"

RDEPENDS:${PN} += "libpasswdqc0"

inherit rpm
