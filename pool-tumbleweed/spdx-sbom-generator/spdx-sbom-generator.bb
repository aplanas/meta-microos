SUMMARY = "SPDX Software Bill of Materials (SBOM) Generator"
DESCRIPTION = "The spdx-sbom-generator tool helps those in the community that want to \
generate SPDX Software Bill of Materials (SBOMs) with current package \
managers. \
 \
It has a command line Interface (CLI) that lets you generate SBOM \
information, including components, licenses, copyrights, and security \
references of your software using SPDX v2.2 specification and aligning \
with the current known minimum elements from NTIA. It automatically \
determines which package managers or build systems are actually being \
used by the software. \
 \
spdx-sbom-generator is supporting the following (bundling) package managers: \
 \
* GoMod (go) \
* Cargo (Rust) \
* Composer (PHP) \
* DotNet (.NET) \
* Maven (Java) \
* NPM (Node.js) \
* Yarn (Node.js) \
* PIP (Python) \
* Pipenv (Python) \
* Gems (Ruby) \
* Swift Package Manager (Swift)"
LICENSE = "Apache-2.0 & CC-BY-4.0"

PV = "0.0.13"

RPM_NAME = "spdx-sbom-generator-0.0.13-1.10.aarch64.rpm"
RPM_HASH = "14fa70d4a284e7e983a88d6a1d1a08b7f738cff7361d437baeb9c9c49628819fc558ed96e82ae13218cf148993324055c6ae605cf67bec4ce5825768277dbb1f"

RPROVIDES:${PN} += "spdx-sbom-generator"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
