SUMMARY = "Vulnerability scanner written in Go"
DESCRIPTION = "Use OSV-Scanner to find existing vulnerabilities affecting your project's dependencies. \
 \
OSV-Scanner provides an officially supported frontend to the OSV database that connects a project’s list of dependencies with the vulnerabilities that affect them. Since the OSV.dev database is open source and distributed, it has several benefits in comparison with closed source advisory databases and scanners: \
 \
- Each advisory comes from an open and authoritative source (e.g. the RustSec Advisory Database) \
- Anyone can suggest improvements to advisories, resulting in a very high quality database \
- The OSV format unambiguously stores information about affected versions in a machine-readable format that precisely maps onto a developer’s list of packages \
 \
The above all results in fewer, more actionable vulnerability notifications, which reduces the time needed to resolve them."
LICENSE = "Apache-2.0"

PV = "1.3.5"

RPM_NAME = "osv-scanner-1.3.5-1.1.aarch64.rpm"
RPM_HASH = "7b95f767170326c567818fbf8d13c74e34d8faf9160b1d8475e0df8b98192175192032b7aa4050c9469d2999e43b0839a75b831b1060efd64418a2196cea73ef"

RPROVIDES:${PN} += "osv-scanner"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
