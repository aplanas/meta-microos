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

PV = "0.44.1"

RPM_NAME = "trivy-0.44.1-1.1.aarch64.rpm"
RPM_HASH = "9fd2c4ef3be271c193793cc7fde1c4335502c30e699f61f73e0b67c5666b83ef60955d5e123b4d09bc14fa2aed0fe8fee888f4bf9e9a4a86318688980068137e"

RPROVIDES:${PN} += "trivy"

RDEPENDS:${PN} += "ca-certificates \
git-core \
libc.so.6 \
rpm"

inherit rpm
