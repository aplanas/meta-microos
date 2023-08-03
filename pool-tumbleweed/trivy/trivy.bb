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

PV = "0.43.1"

RPM_NAME = "trivy-0.43.1-1.1.aarch64.rpm"
RPM_HASH = "cb61ec80ef6a5c5167f7193697809343d2334df2bff0724de284ce2f4ff15c5e23e9612f57123775c1cd9b6ff27225beb2c515abe0bd8dd16a3085b14bbdbaed"

RPROVIDES:${PN} += "trivy"

RDEPENDS:${PN} += "ca-certificates \
git-core \
libc.so.6 \
rpm"

inherit rpm
