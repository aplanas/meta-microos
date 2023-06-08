SUMMARY = "SELinux policies for container runtimes"
DESCRIPTION = "SELinux policy modules for use with container runtimes."
LICENSE = "GPL-2.0-only"

PV = "2.211.0"

RPM_NAME = "container-selinux-2.211.0-1.1.noarch.rpm"
RPM_HASH = "5169975f57872d09eba9ca93291453f019925929c804b80118633d5e4f5e0659b309ec80dcfca0f3e234ccf85c88091a0e74f15499f357e3d24786221db0bbc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "container-selinux"
RDEPENDS:${PN} += "/bin/sh /usr/bin/sed policycoreutils selinux-policy selinux-policy-base selinux-policy-targeted selinux-tools"

inherit rpm
