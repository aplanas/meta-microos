SUMMARY = "Manualpages for Pluggable Authentication Modules"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
This package contains the manual pages."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "pam-manpages-1.5.3-3.1.noarch.rpm"
RPM_HASH = "ed3854194398aa759972b99671d1a90ef4dfcd7a9f70fcc537c7dc81911fdd9ad84a9c2375515cd037e5b1f396702bd1e1f16bf94b19530a5d71a3ae8c49a134"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pam-//usr/share/man/man8/PAM.8.gz \
pam-manpages"

RDEPENDS:${PN} += ""

inherit rpm
