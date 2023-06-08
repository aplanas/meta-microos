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

RPM_NAME = "cadvisor-0.46.0-1.3.aarch64.rpm"
RPM_HASH = "93c899616a9344a94408fe06fc30132e8d891271e14baeb2b9f01770fd937abaa80591936dfa9511b5f22c77dc4b308acc9688e8fc4b8139a278689a60840550"

RPROVIDES:${PN} += "cadvisor cadvisor(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch ca-certificates fillup git-core libc.so.6(GLIBC_2.34)(64bit) rpm"

inherit rpm
