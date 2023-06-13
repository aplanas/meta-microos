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

RPM_NAME = "spdx-sbom-generator-0.0.13-1.9.aarch64.rpm"
RPM_HASH = "1be80c9ffdfb8807f3e77724f0378ae7bb9bf54afc194d7439f47758db3a3f2723576fcfa03add3d53690a74dbae1c4a3ff724204e896a1076ae2fdd3a9f40cb"

RPROVIDES:${PN} += "spdx-sbom-generator \
spdx-sbom-generator(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
