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

RPM_NAME = "cadvisor-0.46.0-1.4.aarch64.rpm"
RPM_HASH = "b98da04cdb3bdf3c75227abbcd53eaeb6ff3f2b65637b661580221bffebbbf23ebeb8cea0d90e6051150f5e0983ff30b3e0e5213589f317c00352655d6fa52a4"

RPROVIDES:${PN} += "cadvisor \
cadvisor(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
ca-certificates \
fillup \
git-core \
libc.so.6()(64bit) \
rpm"

inherit rpm
