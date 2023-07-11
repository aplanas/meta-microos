SUMMARY = "Nordic + Baltic datum grids for Proj"
DESCRIPTION = "Nordic + Baltic datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.1"

RPM_NAME = "proj-data-eur-9.2.1-1.1.noarch.rpm"
RPM_HASH = "585b100b4f81a792188564f4dc35b0acd154d9ee6f0efd58c358ac8074f45f0674e39fbf8715c1a3bc5d6ae54878fee844e937b5d0b2c24fc20a29bca84c7b2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-eur"

RDEPENDS:${PN} += ""

inherit rpm
