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

PV = "1.3.3"

RPM_NAME = "osv-scanner-1.3.3-1.1.aarch64.rpm"
RPM_HASH = "ad275a6cfc2a4107de64ae2ca762a9b92806c24a86cb7c4e58a164c9e4253d4ed2b87bc01466ce78f048e8206194a8a28a1f7e5aa83a33bd5c78bb0c21ab9a27"

RPROVIDES:${PN} += "osv-scanner \
osv-scanner(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
