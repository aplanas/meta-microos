SUMMARY = "A Simple and Comprehensive Vulnerability Scanner for Containers"
DESCRIPTION = "Trivy (`tri` pronounced like trigger, `vy` pronounced like envy) is a simple and \
comprehensive vulnerability scanner for containers and other artifacts. A \
software vulnerability is a glitch, flaw, or weakness present in the software or \
in an Operating System. Trivy detects vulnerabilities of OS packages (Alpine, \
RHEL, CentOS, etc.) and application dependencies (Bundler, Composer, npm, yarn, \
etc.). Trivy is easy to use. Just install the binary and you're ready to \
scan. All you need to do for scanning is to specify a target such as an image \
name of the container."
LICENSE = "Apache-2.0"

PV = "0.46.0"

RPM_NAME = "cadvisor-0.46.0-1.5.aarch64.rpm"
RPM_HASH = "cf8bac08df927de093d5caaccde8c127954d4b47dc60ec62e5e4941a32f82c2bb5452860eaeec8aae24e8e74cf10b58da1d18dfa7f3a15ffc72ac6261270adb5"

RPROVIDES:${PN} += "cadvisor"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
ca-certificates \
fillup \
git-core \
libc.so.6 \
rpm"

inherit rpm
