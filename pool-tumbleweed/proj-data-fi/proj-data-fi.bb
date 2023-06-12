SUMMARY = "Finland datum grids for Proj"
DESCRIPTION = "Finland datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.0"

RPM_NAME = "proj-data-fi-9.2.0-1.3.noarch.rpm"
RPM_HASH = "ad24db4e9a81d27b007d20f54636bed0c360858ba2d0c43643b76f9739becc130598aade3ff0ff2fd736944b9962155d043bb3f8ec60257e957ed9fb1226ecbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-fi"
RDEPENDS:${PN} += ""

inherit rpm
